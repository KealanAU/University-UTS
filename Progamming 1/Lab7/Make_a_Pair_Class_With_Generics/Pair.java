public class Pair <TypeOne, TypeTwo>{

    private TypeOne ObjOne;
    private TypeTwo ObjTwo;

    public Pair() { //No void
        this.ObjOne = null;
        this.ObjTwo = null;
    }

    public Pair(TypeOne paraOne, TypeTwo paraTwo) { //No void
        this.ObjOne = paraOne;
        this.ObjTwo = paraTwo;
    }

    public TypeOne fst(){ 
        //No static, <...> or parameter
        return this.ObjOne; //a doesn't exist
    }

    public TypeTwo snd(){ //No static, <..> or parameter
        return this.ObjTwo;
    }//b doesn't exist

}
