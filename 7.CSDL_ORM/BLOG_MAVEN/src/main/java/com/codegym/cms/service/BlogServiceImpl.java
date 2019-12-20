package com.codegym.cms.service;

import com.codegym.cms.entity.Blog;
import com.codegym.cms.exception.ResourceNotFoundException;
import com.codegym.cms.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class  BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    @Transactional
    public List<Blog> getBlog() {
        return blogRepository.findAll();
    }

    @Override
    @Transactional
    public void saveBlog(Blog theBlog) {
        blogRepository.save(theBlog);
    }

    @Override
    @Transactional
    public Blog getBlog(int id) throws ResourceNotFoundException {
        return blogRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(id));
    }

    @Override
    @Transactional
    public void deleteBlog(int theId) {
        blogRepository.deleteById(theId);
    }
}
