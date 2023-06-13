package ooday05_vis;

public enum Season {
    SPRING("hh","ss");
    //相当于public static final Season SPRING = new Season("","");
    private String seasonName;
    private String seasonDesc;

    public String getSeasonName() {
        return seasonName;
    }
    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
