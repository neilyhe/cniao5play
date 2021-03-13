package com.cniao5.cniao5play.bean;

import java.io.Serializable;
import java.util.List;

public class AppInfo implements Serializable {


    private String code;
    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * name : 孙悟空
         * content : 7月12日的国务院常务会议上，李克强明确要求，要将已审议的《快递条例（草案）》向社会公开征求意见。在会上，总理说了这么一段话：“几年前，快递业刚刚开始发展的时候，有些城市不允许快递存在，理由是影响市容整洁，快递员骑的摩的也不允许停放。但是我们认为，对于任何新生事物，应尽量秉持‘包容审慎’的监管方式，不能一上来就‘管死,有些城市不允许快递存在，理由是影响市容整洁，快递员骑的摩的也不允许停放。但是我们认为，对于任何新生事物，应尽量秉持‘包容审慎’的监管方式，不能一上来就‘管死
         * images : []
         */

        private String name;
        private String content;
        private List<String> images;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
