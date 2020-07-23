package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Image;

public interface ImageService {
	public Iterable<Image> getAllImage();
	public Optional<Image> createImage(Image image); 

}
