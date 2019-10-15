package com.lq.blog.po;

import java.util.Date;
import java.util.List;

public class Comment {
    private Long id;

    private String nickname;

    private String email;

    private String content;

    private String avatar;

    private Date createtime;

    private Long blogid;

    private Long parentcommentid;

    private Blog blog;

    private List<Comment> replaycomments;

    private Comment parentComment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getBlogid() {
        return blogid;
    }

    public void setBlogid(Long blogid) {
        this.blogid = blogid;
    }

    public Long getParentcommentid() {
        return parentcommentid;
    }

    public void setParentcommentid(Long parentcommentid) {
        this.parentcommentid = parentcommentid;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Comment> getReplaycomments() {
        return replaycomments;
    }

    public void setReplaycomments(List<Comment> replaycomments) {
        this.replaycomments = replaycomments;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", createtime=" + createtime +
                ", blogid=" + blogid +
                ", parentcommentid=" + parentcommentid +
                ", blog=" + blog +
                ", replaycomments=" + replaycomments +
                ", parentComment=" + parentComment +
                '}';
    }
}