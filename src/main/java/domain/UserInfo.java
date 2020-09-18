package domain;

public class UserInfo {
    private int userId;
    private String userName;
    private String userPhoto;
    private boolean registeredUser;
    private boolean canRepost;
    private boolean canLikePost;
    private boolean canAddComment;
    private boolean canDeletePost;
    private boolean canEditPost;
    private boolean canPinPost;
    private boolean canComplainOnPost;
    private boolean canAddEmojiToComment;
    private boolean canAddImageToComment;
    private boolean canAddAudioToComment;
    private boolean canAddVideoToComment;
    private boolean canAddDocToComment;
    private boolean canChooseTypeComment;
    private int numbersOfCommentAnswers;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public boolean isRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser = registeredUser;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isCanLikePost() {
        return canLikePost;
    }

    public void setCanLikePost(boolean canLikePost) {
        this.canLikePost = canLikePost;
    }

    public boolean isCanAddComment() {
        return canAddComment;
    }

    public void setCanAddComment(boolean canAddComment) {
        this.canAddComment = canAddComment;
    }

    public boolean isCanDeletePost() {
        return canDeletePost;
    }

    public void setCanDeletePost(boolean canDeletePost) {
        this.canDeletePost = canDeletePost;
    }

    public boolean isCanEditPost() {
        return canEditPost;
    }

    public void setCanEditPost(boolean canEditPost) {
        this.canEditPost = canEditPost;
    }

    public boolean isCanPinPost() {
        return canPinPost;
    }

    public void setCanPinPost(boolean canPinPost) {
        this.canPinPost = canPinPost;
    }

    public boolean isCanComplainOnPost() {
        return canComplainOnPost;
    }

    public void setCanComplainOnPost(boolean canComplainOnPost) {
        this.canComplainOnPost = canComplainOnPost;
    }

    public boolean isCanAddEmojiToComment() {
        return canAddEmojiToComment;
    }

    public void setCanAddEmojiToComment(boolean canAddEmojiToComment) {
        this.canAddEmojiToComment = canAddEmojiToComment;
    }

    public boolean isCanAddImageToComment() {
        return canAddImageToComment;
    }

    public void setCanAddImageToComment(boolean canAddImageToComment) {
        this.canAddImageToComment = canAddImageToComment;
    }

    public boolean isCanAddAudioToComment() {
        return canAddAudioToComment;
    }

    public void setCanAddAudioToComment(boolean canAddAudioToComment) {
        this.canAddAudioToComment = canAddAudioToComment;
    }

    public boolean isCanAddVideoToComment() {
        return canAddVideoToComment;
    }

    public void setCanAddVideoToComment(boolean canAddVideoToComment) {
        this.canAddVideoToComment = canAddVideoToComment;
    }

    public boolean isCanAddDocToComment() {
        return canAddDocToComment;
    }

    public void setCanAddDocToComment(boolean canAddDocToComment) {
        this.canAddDocToComment = canAddDocToComment;
    }

    public boolean isCanChooseTypeComment() {
        return canChooseTypeComment;
    }

    public void setCanChooseTypeComment(boolean canChooseTypeComment) {
        this.canChooseTypeComment = canChooseTypeComment;
    }

    public int getNumbersOfCommentAnswers() {
        return numbersOfCommentAnswers;
    }

    public void setNumbersOfCommentAnswers(int numbersOfCommentAnswers) {
        this.numbersOfCommentAnswers = numbersOfCommentAnswers;
    }
}
