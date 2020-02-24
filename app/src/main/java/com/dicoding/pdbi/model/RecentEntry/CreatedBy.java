package com.dicoding.pdbi.model.RecentEntry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class CreatedBy {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("nick")
        @Expose
        private String nick;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("url_api")
        @Expose
        private String urlApi;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlApi() {
            return urlApi;
        }

        public void setUrlApi(String urlApi) {
            this.urlApi = urlApi;
        }

    }
