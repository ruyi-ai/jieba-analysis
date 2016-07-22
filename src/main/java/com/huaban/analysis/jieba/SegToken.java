package com.huaban.analysis.jieba;

public class SegToken {
    public String word;

    public int startOffset;

    public int endOffset;

    public String nature;


    public SegToken(String word, int startOffset, int endOffset, String nature) {
        this.word = word;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.nature = nature;
    }


    @Override
    public String toString() {
        return "[" + word + ", " + startOffset + ", " + endOffset + "]";
    }

}
