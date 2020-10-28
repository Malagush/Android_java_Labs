package com.example.lab3_recyclerview;

public class DummyItem {
        public static String id = null;
        public static String content = null;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }

