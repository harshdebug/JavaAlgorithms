public class BuilderPattern{

    // Required parameters
    private int id;
    private int ssn;

    // Optional parameters
    private String phoneNumber;
    private String address;

    public static class Builder
    {
        public int b_id;
        public int b_ssn;

        public String b_address = "";
        public String b_phoneNumber = "";


        private Builder(int id, int ssn)
        {
            this.b_id = id;
            this.b_ssn = ssn;
        }
        public static Builder buildPattern(int id, int ssn)
        {
            return new Builder(id, ssn);
        }

        public Builder address(String address)
        {
            this.b_address = address;
            return this;
        }

        public  Builder phoneNumber(String phoneNumber)
        {
            this.b_phoneNumber = phoneNumber;
            return this;
        }

        public BuilderPattern build()
        {
            return new BuilderPattern(this);
        }
    }

    private  BuilderPattern(Builder bld)
    {
        this.ssn = bld.b_ssn;
        this.id = bld.b_id;
        this.phoneNumber = bld.b_phoneNumber;
        this.address = bld.b_address;
    }

    // Usage
    public static void main(String[] args)
    {
        BuilderPattern bp = BuilderPattern.Builder.buildPattern(32,4529).address("Vashi").phoneNumber("5852").build();
    }
}
