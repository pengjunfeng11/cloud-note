package cn.edu.jit.entry;

import java.io.Serializable;

/**
 * 笔记标签实体类
 * @author jitwxs
 */
public class ArticleTagKey implements Serializable {
    private String articleId;

    private String tagId;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }
}