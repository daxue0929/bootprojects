package com.daxue.test.entity;

import java.io.File;
import java.io.Serializable;

/**
 * @author wangxuedi
 * Date: 2020/3/30 11:14
 * describe:
 */
public class FrameEntity implements Serializable {
    public int frameIndex;
    public String frameName;

    public String imageFile;
    public String videoFile;
    public String audioFile;

    public String textName;
    public Integer imageSize;
    public Integer videoSize;
    public Integer audioSize;
    public Integer textSize;
    public String text;
    public Integer size = 0;
    public int time = 0;


    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getVideoFile() {
        return videoFile;
    }

    public void setVideoFile(String videoFile) {
        this.videoFile = videoFile;
    }

    public String getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(String audioFile) {
        this.audioFile = audioFile;
    }

    public int getFrameIndex() {
        return frameIndex;
    }

    public void setFrameIndex(int frameIndex) {
        this.frameIndex = frameIndex;
    }

    public String getFrameName() {
        return frameName;
    }

    public void setFrameName(String frameName) {
        this.frameName = frameName;
    }





    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public Integer getImageSize() {
        return imageSize;
    }

    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

    public Integer getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(Integer videoSize) {
        this.videoSize = videoSize;
    }

    public Integer getAudioSize() {
        return audioSize;
    }

    public void setAudioSize(Integer audioSize) {
        this.audioSize = audioSize;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
