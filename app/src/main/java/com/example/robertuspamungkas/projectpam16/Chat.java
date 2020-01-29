package com.example.robertuspamungkas.projectpam16;

/**
 * Created by Robertus Pamungkas on 11/30/2016.
 */
public class Chat {


        private String name;
        private String text;


        public Chat() {
        }

        public Chat(String name, String message) {
            this.setName(name);
            this.setText(message);

        }

        public String getName() {
            return name;
        }



        public String getText() {
            return text;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }
}

