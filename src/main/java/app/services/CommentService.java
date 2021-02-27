package app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import app.repositories.CommentRepository;

@Service
@EnableAsync
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepo;

    @Async
	public void deleteAllByTask(String id) {
        commentRepo.deleteByTaskId(id);
	}

	public Object findAuthorBy_id(String commentId) {
		return commentRepo.findOneBy_id(commentId).getAuthor();
	}
    
}
