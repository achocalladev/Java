/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proycpalabra;

/**
 *
 * @author iveth
 */
public class CString {
    private String texto;
    
public CString()
{
   texto="";
}

public void SetPalabra(String p)
{
    texto=p;
}
public String GetPalabra()
{
    return (texto);
}

public void ConvertirMayuscula()
{
    texto=texto.toUpperCase();
}

public void ConvertirMinuscula()
{
    texto=texto.toLowerCase();
}

public void EliminarEspacios()
{
    texto=texto.replace(" ","");
}

public int LongitudTexto()
{
    return (texto.length());
}


    
}
