package com.br.hub.facecomparison.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="image1 or image2 are not valid or do not have faces to compare.")
public class InvalidImageException extends IOException {
}