package Last;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public class Last {
public static void main(String[] args) {
	
	Model model =ModelFactory.createDefaultModel();
	String ex = "http://example.com/";
	
	//国
	Resource kuni=model.createResource(ex+"国");
	Resource Japan =model.createResource(ex+"Japan");
	Resource China =model.createResource(ex+"China");
	Resource Korea=model.createResource(ex+"Korea");
	
	//都道府県
	Resource Saitama=model.createResource(ex+"埼玉");
	Resource Tokyo=model.createResource(ex+"東京");
	Resource Ibaraki=model.createResource(ex+"茨城");
	Resource Tochigi=model.createResource(ex+"栃木");
	Resource Gunma=model.createResource(ex+"群馬");
	Resource Chiba=model.createResource(ex+"千葉");
	Resource Kanagawa=model.createResource(ex+"神奈川");

	//市区町村
	Resource Koshigaya=model.createResource(ex+"越谷");
	Resource Kasukabe=model.createResource(ex+"春日部");
	Resource Matubushi=model.createResource(ex+"松伏");
	Resource Yoshikawa=model.createResource(ex+"吉川");
	Resource Soka=model.createResource(ex+"草加");
	Resource Kawaguchi=model.createResource(ex+"川口");
	Resource Saitamashi=model.createResource(ex+"さいたま");
	Resource Sirooka=model.createResource(ex+"白岡");
	Resource Miyashiro=model.createResource(ex+"宮代");
	Resource Sugito=model.createResource(ex+"杉戸");
	Resource Yashio=model.createResource(ex+"八潮");
	Resource Misato=model.createResource(ex+"三郷");
	Resource Warabi=model.createResource(ex+"蕨");
	Resource Toda=model.createResource(ex+"戸田");
	Resource Kawagoe=model.createResource(ex+"川越");
	Resource Ageo=model.createResource(ex+"上尾");
	Resource Asaka=model.createResource(ex+"朝霞");
	Resource Siki=model.createResource(ex+"志木");
	Resource Hujimi=model.createResource(ex+"富士見");
	Resource Hasuda=model.createResource(ex+"蓮田");


	Resource Adachiku=model.createResource(ex+"足立区");
	Resource Kitaku=model.createResource(ex+"北区");

	Resource Noda=model.createResource(ex+"野田");
	Resource Nagareyama=model.createResource(ex+"流山");

	//Resource =model.createResource(ex+"");

	
	//Saitama.addProperty(RDF.type,RDF.Property);
	
	Property country=model.createProperty(ex+"country");
	kuni.addProperty(country,Japan);
	kuni.addProperty(country,Korea);
	kuni.addProperty(country,China);

	//県
	Property prefecture=model.createProperty(ex+"prefecture");
	Japan.addProperty(prefecture,Saitama);
	Japan.addProperty(prefecture,Tokyo);
	Japan.addProperty(prefecture, Chiba);
	Japan.addProperty(prefecture, Kanagawa);
	Japan.addProperty(prefecture, Gunma);
	Japan.addProperty(prefecture, Ibaraki);
	Japan.addProperty(prefecture, Tochigi);

	
	Property preID=model.createProperty(ex+"都道府県コード");
	Ibaraki.addProperty(preID,"8");
	Tochigi.addProperty(preID,"9");
	Gunma.addProperty(preID,"10");
	Saitama.addProperty(preID,"11");
	Chiba.addProperty(preID,"12");
	Tokyo.addProperty(preID,"13");
	Kanagawa.addProperty(preID,"14");

	Property city =model.createProperty(ex+"市");
	Saitama.addProperty(city, Koshigaya);
	Saitama.addProperty(city, Soka);
	Saitama.addProperty(city, Kawaguchi);
	Saitama.addProperty(city, Yoshikawa);
	Saitama.addProperty(city, Saitamashi);
	Saitama.addProperty(city, Kasukabe);
	Saitama.addProperty(city,Sirooka);
	Saitama.addProperty(city,Warabi);
	Saitama.addProperty(city,Kawagoe);
	Saitama.addProperty(city,Ageo);
	Saitama.addProperty(city,Asaka);
	Saitama.addProperty(city,Siki);
	Saitama.addProperty(city,Hujimi);
	Saitama.addProperty(city,Hasuda);

	//Saitama.addProperty(city,);
	
	Chiba.addProperty(city,Noda);
	Chiba.addProperty(city,Nagareyama);

	
	//町
	Property town =model.createProperty(ex+"町");
	Saitama.addProperty(town, Matubushi);
	Saitama.addProperty(town, Miyashiro);
	Saitama.addProperty(town, Sugito);

	Property ku =model.createProperty(ex+"区");
	Tokyo.addProperty(ku, Adachiku);
	Tokyo.addProperty(ku, Kitaku);
	
	Property cityID=model.createProperty(ex+"cityID");
	Koshigaya.addProperty(cityID, "2224");
	Yoshikawa.addProperty(cityID, "2437");
	Matubushi.addProperty(cityID,"4651" );
	Soka.addProperty(cityID, "2216");
	Kawaguchi.addProperty(cityID, "2038");
	Saitamashi.addProperty(cityID,"1007" );
	Kasukabe.addProperty(cityID, "2143");
	
	Property Rinsetu=model.createProperty(ex+"越谷市に隣接");
	Koshigaya.addProperty(Rinsetu, Matubushi);
	Koshigaya.addProperty(Rinsetu, Soka);
	Koshigaya.addProperty(Rinsetu, Kawaguchi);
	Koshigaya.addProperty(Rinsetu, Yoshikawa);
	Koshigaya.addProperty(Rinsetu, Saitamashi);
	Koshigaya.addProperty(Rinsetu, Kasukabe);
	
	Property Rinsetu1=model.createProperty(ex+"春日部市に隣接");
	Kasukabe.addProperty(Rinsetu1, Saitamashi);
	Kasukabe.addProperty(Rinsetu1, Koshigaya);
	Kasukabe.addProperty(Rinsetu1, Sirooka);
	Kasukabe.addProperty(Rinsetu1, Miyashiro);
	Kasukabe.addProperty(Rinsetu1, Sugito);
	Kasukabe.addProperty(Rinsetu1, Matubushi);
	Kasukabe.addProperty(Rinsetu1, Noda);
	
	Property Rinsetu2=model.createProperty(ex+"草加市に隣接");
	Soka.addProperty(Rinsetu2, Kawaguchi);
	Soka.addProperty(Rinsetu2, Koshigaya);
	Soka.addProperty(Rinsetu2, Yashio);
	Soka.addProperty(Rinsetu2, Misato);
	Soka.addProperty(Rinsetu2, Yoshikawa);
	Soka.addProperty(Rinsetu2, Adachiku);
	
	Property Rinsetu3=model.createProperty(ex+"松伏町に隣接");
	Matubushi.addProperty(Rinsetu3, Kasukabe);
	Matubushi.addProperty(Rinsetu3, Koshigaya);
	Matubushi.addProperty(Rinsetu3, Noda);
	Matubushi.addProperty(Rinsetu3, Yoshikawa);
	
	Property Rinsetu4=model.createProperty(ex+"吉川市に隣接");
	Yoshikawa.addProperty(Rinsetu4, Soka);
	Yoshikawa.addProperty(Rinsetu4, Koshigaya);
	Yoshikawa.addProperty(Rinsetu4, Matubushi);
	Yoshikawa.addProperty(Rinsetu4, Misato);
	Yoshikawa.addProperty(Rinsetu4, Noda);
	Yoshikawa.addProperty(Rinsetu4, Nagareyama);
	
	Property Rinsetu5=model.createProperty(ex+"川口市に隣接");
	Kawaguchi.addProperty(Rinsetu5, Soka);
	Kawaguchi.addProperty(Rinsetu5, Koshigaya);
	Kawaguchi.addProperty(Rinsetu5, Saitamashi);
	Kawaguchi.addProperty(Rinsetu5, Warabi);
	Kawaguchi.addProperty(Rinsetu5, Toda);
	Kawaguchi.addProperty(Rinsetu5, Adachiku);
	Kawaguchi.addProperty(Rinsetu5, Kitaku);

	Property Rinsetu6=model.createProperty(ex+"さいたま市に隣接");
	Saitamashi.addProperty(Rinsetu6, Koshigaya);
	Saitamashi.addProperty(Rinsetu6, Kawagoe);
	Saitamashi.addProperty(Rinsetu6, Kasukabe);
	Saitamashi.addProperty(Rinsetu6, Warabi);
	Saitamashi.addProperty(Rinsetu6, Toda);
	Saitamashi.addProperty(Rinsetu6, Ageo);
	Saitamashi.addProperty(Rinsetu6, Asaka);
	Saitamashi.addProperty(Rinsetu6, Siki);
	Saitamashi.addProperty(Rinsetu6, Hujimi);
	Saitamashi.addProperty(Rinsetu6, Hasuda);
	Saitamashi.addProperty(Rinsetu6, Sirooka);

	
	
	model.setNsPrefix("ex",ex);
	model.setNsPrefix("xsd", "http://www.w3.org/2001/XMLSchema#");
	
	model.write(System.out,"TTL");
	}

}