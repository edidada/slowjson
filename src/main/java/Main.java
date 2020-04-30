import json.JsonLexer;
import json.JsonParser;
import json.MyJsonVisitor;
import json.bean.JsonNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: WuCheng
 * @create: 2020-04-30 15:33
 **/

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = Main.class.getClassLoader().getResourceAsStream("demo.json");
            JsonLexer lexer = new JsonLexer(CharStreams.fromStream(is));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JsonParser parser = new JsonParser(tokens);
            ParseTree jsonTree = parser.json();
            MyJsonVisitor jsonVisitor = new MyJsonVisitor();
            jsonVisitor.visit(jsonTree);
            JsonNode jsonNode = jsonVisitor.jsonNode;
            System.out.println(jsonNode);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
