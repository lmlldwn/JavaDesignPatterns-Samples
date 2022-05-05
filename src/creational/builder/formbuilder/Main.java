package creational.builder.formbuilder;

public class Main {
    static Form newForm;

    public  static void main(String[] args){
        Form.FormBuilder builder = new Form.FormBuilder("Lemuel", "Garcia");
        builder.addAddress("Cavite");

        newForm = builder.build();
    }
}
