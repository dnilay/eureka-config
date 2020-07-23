package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ImageDao;
import com.example.demo.model.Image;

@Service
@EnableTransactionManagement
public class ImageServiceImpl implements ImageService {
	private ImageDao imageDao;

	@Autowired
	public ImageServiceImpl(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	@Transactional
	public Iterable<Image> getAllImage() {
	
		return imageDao.findAll();

	}

	@Override
	@Transactional
	public Optional<Image> createImage(Image image) {
	
		imageDao.save(image);
		return Optional.of(image);
	}

}
