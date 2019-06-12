package com.julianrios.cherry.service;

import com.julianrios.cherry.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A service to handle incoming request from the client to the quote server.
 * This service communicates request to the server and returns response to the Quote Controller.
 */
@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;




}
