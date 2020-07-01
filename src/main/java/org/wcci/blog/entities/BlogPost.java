package org.wcci.blog.entities;


public class BlogPost {
    public class Reviews {


        private long id;
        private String author;
        private String postDate;
        private String postContent;
        private String postTitle;
        private String hashtag;

        public Reviews(String author, String postDate, String postContent, String postTitle, String hashtag) {
            this.author = author;
            this.postDate = postDate;
            this.postContent = postContent;
            this.postTitle = postTitle;
            this.hashtag = hashtag;
        }

        public long getId() {
            return id;
        }

        public String getAuthor() {
            return author;
        }

        public String getPostDate() {
            return postDate;
        }

        public String getPostContent() {
            return postContent;
        }

        public String getPostTitle() {
            return postTitle;
        }

        public String getHashtag() {
            return hashtag;
        }

    }
}