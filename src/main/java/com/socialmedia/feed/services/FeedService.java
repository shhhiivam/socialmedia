package com.socialmedia.feed.services;

import com.socialmedia.feed.models.CommentDO;
import com.socialmedia.feed.models.PostDO;
import com.socialmedia.feed.models.ResponseDO;
import com.socialmedia.feed.repositories.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FeedService {
    @Autowired
    private PostRepository postRepository;

    public ResponseDO getAllPostsByGroupId(String groupId){
        ResponseDO responseDO = new ResponseDO();
        return responseDO;
    }
    public ResponseDO getAllPostsForUsername(String username){
        ResponseDO responseDO = new ResponseDO();
        return responseDO;
    }
    public ResponseDO getAllGroupForUsername(String username){
        ResponseDO responseDO = new ResponseDO();
        return responseDO;
    }
    public ResponseDO addPost(PostDO postDO){
        ResponseDO responseDO = new ResponseDO();
        return responseDO;
    }
    public ResponseDO addLike(Integer postId,Integer userId){
        ResponseDO responseDO = new ResponseDO();
        return responseDO;
    }

    public ResponseDO addComment(CommentDO commentDO){
        ResponseDO responseDO = new ResponseDO();
        return responseDO;
    }
}

