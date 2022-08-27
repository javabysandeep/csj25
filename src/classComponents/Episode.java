package classComponents;

public class Episode {
    int episodeId;
    String episodeName;
    int episodeDuration;
    static String seasonName="Cyber success java";

    //zero param con
    Episode(){
        episodeId=1;
        episodeName="epsisode name";
        episodeDuration=1;
    }

    //param con
    Episode(int eNum, String eName, int eDuration ){
        episodeId = eNum;
        episodeName = eName;
        episodeDuration = eDuration;
    }

    public static void main(String[] args) {
        Episode episode1 = new Episode(1, "Core Java",100);
        Episode episode2 = new Episode(2, "Advance Java",40);
        Episode episode3 = new Episode(3,"Frameworks",100);

        System.out.println(episode1.episodeId+"\t"+episode1.episodeName+"\t"+episode1.episodeDuration);
        System.out.println(episode2.episodeId+"\t"+episode2.episodeName+"\t"+episode2.episodeDuration);
        System.out.println(episode3.episodeId+"\t"+episode3.episodeName+"\t"+episode3.episodeDuration);
    }
}
