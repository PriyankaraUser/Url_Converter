package com.dialogIntern.urlConverter.controller;

import com.dialogIntern.urlConverter.model.Url;
import com.dialogIntern.urlConverter.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("url/shortner")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/{id}")
    public String getOriginalUrl(@PathVariable String id) {
        return urlService.getOriginalUrl(id);
    }

    @PostMapping
    public Url generateShortUrl(@RequestBody String url) {
        return urlService.generateShortUrl(url);
    }
}
