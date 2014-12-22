abstract class RestoranStore {

    public Restoran orderZakaz () {
        Restoran restoran;
        
        restoran = createZakaz();
        
        restoran.prepare();
        restoran.freeze();
        restoran.voda();
        restoran.box();
        
        return restoran;
    }
    protected abstract Restoran createZakaz ();
}
