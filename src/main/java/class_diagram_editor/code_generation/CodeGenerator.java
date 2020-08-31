package class_diagram_editor.code_generation;

import class_diagram_editor.diagram.Class;
import lombok.Getter;
import class_diagram_editor.diagram.code_generation.ClassGenerator;

@Getter
public class CodeGenerator {

    private String lastGeneratedCode;

    private void generate(String code) {
        lastGeneratedCode = code;
    }

    public void visitClass(Class c) {
        ClassGenerator classModel = new ClassGenerator();

        generate(classModel.generate(c));
    }

}
