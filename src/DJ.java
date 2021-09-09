public class DJ {

    private String stageName;
    private String name;
    private int registrationId;

    public DJ(){

    }

    public void playSet(String setName){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getName() {
        return name;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }
}
