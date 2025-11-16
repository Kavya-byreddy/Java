class ticket
{
    public static void main(String[] args)
    {
       String id_proof="aadhar card";
       String id_proof2="pan card";
       String id_card="admit card";
       int passport_photo=2;
       String certificate="10th certificate";
       if(id_proof=="aadhar card" && id_proof2=="pan card" &&  id_card=="admit card" && passport_photo==1 && certificate=="10th certificate")
       {
         System.out.println("on boarding processing");
       }
       else
       {
         System.out.println("get back the proofs");
       }
    }
}