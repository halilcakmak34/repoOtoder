/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package otoder;

/**
 *
 * @author Cihan
 */
public class Ogrenci {
    String mName, mLastname , mId ;

    public Ogrenci( String name , String lastname , String id ) {
        mName = name;
        mLastname = lastname;
        mId = id; 
    }
    
    //sadece id verilirse geri kalan bilgileri databaseden tamamlamak icin
    public Ogrenci( String id ){
        
    }
    
    void getStudentInfoFromDb( String id ){
        
    }
    
    void setName( String name ){
        
    }
    
    String getName(){
    
        return null;
    }
    
    void setLastname( String lastname){
        
    }
    
    String getLastname( ){
        return null;
    }
    
    void setId( String id ){
        
    }
    
    String getId( ){
        return null;
    }
}
