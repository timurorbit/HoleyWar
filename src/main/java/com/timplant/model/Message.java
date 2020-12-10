package com.timplant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String text;
    private String tag;

    private String filename;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    public Message() {
    }

    public Message(String text, String tag, User user) {
        this.text = text;
        this.tag = tag;
        author = user;
    }

    public String getAuthorName() {
        return author != null ? author.getUsername() : "<none>";
    }
}
            