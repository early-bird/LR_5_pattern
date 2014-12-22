class TRestoranStore extends RestoranStore{
    @Override
    protected Restoran createZakaz() {
        
            return new TStyle();
        
    }
}
