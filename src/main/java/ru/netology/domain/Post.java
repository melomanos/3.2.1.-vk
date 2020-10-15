package ru.netology.domain;

import java.util.Date;
import java.util.List;

public class Post {
    private String id;
    private String logoUrl;
    private String posterUrl;
    private String mainPageUrl;
    private boolean postIsFixed;
    private String complainUrl;
    private boolean saveToBookmarks;
    private boolean subscribe;
    private Date dateOfPost;
    private String message;
    private boolean showInFull;
    private String imageUrl;
    private int likesCounter;
    private List listOfLikers;
    private int commentsCounter;
    private int shareCounter;
    private int viewsCounter;
}
