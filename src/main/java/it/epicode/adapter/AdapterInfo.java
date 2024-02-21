package it.epicode.adapter;


import java.time.LocalDate;

public class AdapterInfo implements DataSource{
    private Info info;

    public AdapterInfo(Info info) {
        this.info = info;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }


    @Override
    public String getNameComplete(){
       return info.getName()+info.getCognome();
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - info.getDataDiNascita().getYear();
    }
}
