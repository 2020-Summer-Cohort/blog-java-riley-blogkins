package org.wcci.blog;


public class BlogPost {
    public class Reviews {

        private long id;
        private String author;
        private String postDate;
        private String postContent;
        private String postTitle;
        private String hashtag;

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