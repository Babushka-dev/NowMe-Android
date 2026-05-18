package com.example.nowme.network.dto;

import java.io.Serializable;

public class CommentResponse implements Serializable {
    public Long id;
    public Long userId;
    public String userAvatar;
    public String username;
    public String content;
}