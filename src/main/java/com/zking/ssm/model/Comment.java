package com.zking.ssm.model;

public class Comment {
    private Integer commentId;

    private String commentInfo;

    private Integer goodsId;

    private Integer userId;

    public Comment(Integer commentId, String commentInfo, Integer goodsId, Integer userId) {
        this.commentId = commentId;
        this.commentInfo = commentInfo;
        this.goodsId = goodsId;
        this.userId = userId;
    }

    public Comment() {
        super();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}