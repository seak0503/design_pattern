class Main {
    public static void main(String[] args) {
        StringBuffer md = new StringBuffer();
        int count = 0;
        md.append("おはようございます\n");
        count++;
        md.append("こんにちは\n");
        count++;
        md.append("おやすみなさい\n");
        count++;
        System.out.println(md.toString());
    }
}