package com.github.information.entity;

/**
 * @author mingyux
 */
public class Owner {
    private String login;//"xmyLydia",
    private Long id;//13426579,
    private String node_id;//"MDQ6VXNlcjEzNDI2NTc5",
    private String avatar_url;//"https://avatars.githubusercontent.com/u/13426579?v=4",
    private String gravatar_id;//"",
    private String url;//"https://api.github.com/users/xmyLydia",
    private String html_url;//"https://github.com/xmyLydia",
    private String followers_url;//"https://api.github.com/users/xmyLydia/followers",
    private String following_url;//"https://api.github.com/users/xmyLydia/following{/other_user}",
    private String gists_url;//"https://api.github.com/users/xmyLydia/gists{/gist_id}",
    private String starred_url;//"https://api.github.com/users/xmyLydia/starred{/owner}{/repo}",
    private String subscriptions_url;//"https://api.github.com/users/xmyLydia/subscriptions",
    private String organizations_url;//"https://api.github.com/users/xmyLydia/orgs",
    private String repos_url;//"https://api.github.com/users/xmyLydia/repos",
    private String events_url;//"https://api.github.com/users/xmyLydia/events{/privacy}",
    private String received_events_url;//"https://api.github.com/users/xmyLydia/received_events",
    private String type;//"User",
    private boolean site_admin;//false

    public Owner() {
    }

    public Owner(String login, Long id, String node_id, String avatar_url, String gravatar_id, String url,
                 String html_url, String followers_url, String following_url, String gists_url,
                 String starred_url, String subscriptions_url, String organizations_url,
                 String repos_url, String events_url, String received_events_url, String type,
                 boolean site_admin) {
        this.login = login;
        this.id = id;
        this.node_id = node_id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.organizations_url = organizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.site_admin = site_admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSite_admin() {
        return site_admin;
    }

    public void setSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
    }
}
