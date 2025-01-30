package Others.Chatgpt.EncapsulationPractice;

public class Data {
        private String productname;
        private  int price;
        private  int qualtity;

        public Data(String productname, int price, int qualtity) {
                this.productname = productname;
                this.price = price;
                this.qualtity = qualtity;
        }

        public String getProductname() {
                return productname;
        }

        public void setProductname(String productname) {
                this.productname = productname;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public int getQualtity() {
                return qualtity;
        }

        public void setQualtity(int qualtity) {
                this.qualtity = qualtity;
        }
}
