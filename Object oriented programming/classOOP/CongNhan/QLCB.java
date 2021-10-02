import java.until.List;

public class QLCB {
    protected List<CanBo> canBo;

    public QLCB() {
        this.canBo = new ArrayList<CanBo>();
    }

    public addCanBo(CanBo canBo) {
        this.canBo.add(canBo);
    }

    public searchCanBo(CanBo canBo) {
        for( CanBo it : this.canBo ){
            if(it.name.equals(canBo.name)){
                return it;
            }
        }
    }

    puclic showCanBo() {
        for (canBo it : this.canBo) {
            System.out.println(it.toString());
        }
    }
}
