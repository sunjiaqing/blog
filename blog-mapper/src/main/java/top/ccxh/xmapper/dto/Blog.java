package top.ccxh.xmapper.dto;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *博客
 * @author honey
 */
@Table(name = "t_blog")
public class Blog implements Serializable {
    private static final long serialVersionUID = 7L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String title;
    private String tag;
    private Date createTime;
    private String url;
    private String githubName;
    private Date githubTime;
    @JSONField(serialize=true)
    @Transient
    private String content;
 /*   @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", tag='" + tag + '\'' +
                ", createTime=" + createTime +
                ", url='" + url + '\'' +
                ", githubName='" + githubName + '\'' +
                ", githubTime=" + githubTime +
                '}';
    }*/
 
    public Date getGithubTime() {
        return githubTime;
    }

    public void setGithubTime(Date githubTime) {
        this.githubTime = githubTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGithubName() {
        return githubName;
    }

    public void setGithubName(String githubName) {
        this.githubName = githubName;
    }

    public Blog setContent(String article) {
        this.content=article;
        return this;
    }

    public String getContent() {
        return content;
    }
}
