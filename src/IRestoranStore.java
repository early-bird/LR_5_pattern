class IRestoranStore extends RestoranStore{
    @Override
    protected Restoran createZakaz() {
        return new IStyle();
    }
}
