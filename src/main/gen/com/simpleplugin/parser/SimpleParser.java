// This is a generated file. Not intended for manual editing.
package com.simpleplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.simpleplugin.psi.SimpleTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SimpleParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == IDENTIFIER) {
      r = Identifier(b, 0);
    }
    else if (t == ANON_STRUCT_TYPE_NAME) {
      r = anonStructTypeName(b, 0);
    }
    else if (t == ASSIGNMENT_STATEMENT) {
      r = assignmentStatement(b, 0);
    }
    else if (t == BUILT_IN_REFERENCE_TYPE_NAME) {
      r = builtInReferenceTypeName(b, 0);
    }
    else if (t == BUILT_IN_TYPE_NAME) {
      r = builtInTypeName(b, 0);
    }
    else if (t == CALLABLE_UNIT_BODY) {
      r = callableUnitBody(b, 0);
    }
    else if (t == CALLABLE_UNIT_SIGNATURE) {
      r = callableUnitSignature(b, 0);
    }
    else if (t == DEFINITION) {
      r = definition(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == EXPRESSION_LIST) {
      r = expressionList(b, 0);
    }
    else if (t == EXPRESSION_STMT) {
      r = expressionStmt(b, 0);
    }
    else if (t == FUNCTION_DEFINITION) {
      r = functionDefinition(b, 0);
    }
    else if (t == FUNCTION_INVOCATION) {
      r = functionInvocation(b, 0);
    }
    else if (t == FUNCTION_TYPE_NAME) {
      r = functionTypeName(b, 0);
    }
    else if (t == IMPORT_DECLARATION) {
      r = importDeclaration(b, 0);
    }
    else if (t == LAMBDA_FUNCTION) {
      r = lambdaFunction(b, 0);
    }
    else if (t == NAME_REFERENCE) {
      r = nameReference(b, 0);
    }
    else if (t == NATIVE_FUNCTION_DEFINITION) {
      r = nativeFunctionDefinition(b, 0);
    }
    else if (t == NON_NATIVE_FUNCTION_DEFINITION) {
      r = nonNativeFunctionDefinition(b, 0);
    }
    else if (t == PACKAGE_DECLARATION) {
      r = packageDeclaration(b, 0);
    }
    else if (t == PACKAGE_NAME) {
      r = packageName(b, 0);
    }
    else if (t == PARAMETER) {
      r = parameter(b, 0);
    }
    else if (t == PARAMETER_LIST) {
      r = parameterList(b, 0);
    }
    else if (t == REFERENCE_TYPE_NAME) {
      r = referenceTypeName(b, 0);
    }
    else if (t == RESOURCE_DEFINITION) {
      r = resourceDefinition(b, 0);
    }
    else if (t == RETURN_PARAMETERS) {
      r = returnParameters(b, 0);
    }
    else if (t == SERVICE_BODY) {
      r = serviceBody(b, 0);
    }
    else if (t == SERVICE_DEFINITION) {
      r = serviceDefinition(b, 0);
    }
    else if (t == STATEMENT) {
      r = statement(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = typeName(b, 0);
    }
    else if (t == USER_DEFINE_TYPE_NAME) {
      r = userDefineTypeName(b, 0);
    }
    else if (t == VALUE_TYPE_NAME) {
      r = valueTypeName(b, 0);
    }
    else if (t == VARIABLE_DEFINITION_STATEMENT) {
      r = variableDefinitionStatement(b, 0);
    }
    else if (t == VARIABLE_REFERENCE) {
      r = variableReference(b, 0);
    }
    else if (t == VARIABLE_REFERENCE_LIST) {
      r = variableReferenceList(b, 0);
    }
    else if (t == VERSION) {
      r = version(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return compilationUnit(b, l + 1);
  }

  /* ********************************************************** */
  // Letter+ LetterOrDigit*
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier_0(b, l + 1);
    r = r && Identifier_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  // Letter+
  private static boolean Identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LETTER);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, LETTER)) break;
      if (!empty_element_parsed_guard_(b, "Identifier_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LetterOrDigit*
  private static boolean Identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, LETTERORDIGIT)) break;
      if (!empty_element_parsed_guard_(b, "Identifier_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // !(FUNCTION | SERVICE)
  static boolean TopLevelDefinitionRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelDefinitionRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !TopLevelDefinitionRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FUNCTION | SERVICE
  private static boolean TopLevelDefinitionRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelDefinitionRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, SERVICE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRUCT structBody
  public static boolean anonStructTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonStructTypeName")) return false;
    if (!nextTokenIs(b, STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRUCT, STRUCTBODY);
    exit_section_(b, m, ANON_STRUCT_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // (VAR)? variableReferenceList ASSIGN expression SEMICOLON
  public static boolean assignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatement")) return false;
    if (!nextTokenIs(b, "<assignment statement>", LETTER, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STATEMENT, "<assignment statement>");
    r = assignmentStatement_0(b, l + 1);
    r = r && variableReferenceList(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (VAR)?
  private static boolean assignmentStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatement_0")) return false;
    consumeToken(b, VAR);
    return true;
  }

  /* ********************************************************** */
  // TYPE_MAP (LT typeName GT)?
  //     |   TYPE_XML (LT (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)? xmlLocalName GT)?
  //     |   TYPE_JSON (LT nameReference GT)?
  //     |   TYPE_TABLE (LT nameReference GT)?
  //     |   functionTypeName
  public static boolean builtInReferenceTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_REFERENCE_TYPE_NAME, "<built in reference type name>");
    r = builtInReferenceTypeName_0(b, l + 1);
    if (!r) r = builtInReferenceTypeName_1(b, l + 1);
    if (!r) r = builtInReferenceTypeName_2(b, l + 1);
    if (!r) r = builtInReferenceTypeName_3(b, l + 1);
    if (!r) r = functionTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TYPE_MAP (LT typeName GT)?
  private static boolean builtInReferenceTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_MAP);
    r = r && builtInReferenceTypeName_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT typeName GT)?
  private static boolean builtInReferenceTypeName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_0_1")) return false;
    builtInReferenceTypeName_0_1_0(b, l + 1);
    return true;
  }

  // LT typeName GT
  private static boolean builtInReferenceTypeName_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && typeName(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_XML (LT (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)? xmlLocalName GT)?
  private static boolean builtInReferenceTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_XML);
    r = r && builtInReferenceTypeName_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)? xmlLocalName GT)?
  private static boolean builtInReferenceTypeName_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_1_1")) return false;
    builtInReferenceTypeName_1_1_0(b, l + 1);
    return true;
  }

  // LT (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)? xmlLocalName GT
  private static boolean builtInReferenceTypeName_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && builtInReferenceTypeName_1_1_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, XMLLOCALNAME, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)?
  private static boolean builtInReferenceTypeName_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_1_1_0_1")) return false;
    builtInReferenceTypeName_1_1_0_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACE xmlNamespaceName RIGHT_BRACE
  private static boolean builtInReferenceTypeName_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACE, XMLNAMESPACENAME, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_JSON (LT nameReference GT)?
  private static boolean builtInReferenceTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_JSON);
    r = r && builtInReferenceTypeName_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT nameReference GT)?
  private static boolean builtInReferenceTypeName_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_2_1")) return false;
    builtInReferenceTypeName_2_1_0(b, l + 1);
    return true;
  }

  // LT nameReference GT
  private static boolean builtInReferenceTypeName_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && nameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_TABLE (LT nameReference GT)?
  private static boolean builtInReferenceTypeName_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_TABLE);
    r = r && builtInReferenceTypeName_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT nameReference GT)?
  private static boolean builtInReferenceTypeName_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_3_1")) return false;
    builtInReferenceTypeName_3_1_0(b, l + 1);
    return true;
  }

  // LT nameReference GT
  private static boolean builtInReferenceTypeName_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInReferenceTypeName_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && nameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE_ANY | TYPE_TYPE | valueTypeName | builtInReferenceTypeName | typeName (LEFT_BRACKET RIGHT_BRACKET)+
  public static boolean builtInTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_TYPE_NAME, "<built in type name>");
    r = consumeToken(b, TYPE_ANY);
    if (!r) r = consumeToken(b, TYPE_TYPE);
    if (!r) r = valueTypeName(b, l + 1);
    if (!r) r = builtInReferenceTypeName(b, l + 1);
    if (!r) r = builtInTypeName_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeName (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean builtInTypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInTypeName_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeName(b, l + 1);
    r = r && builtInTypeName_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean builtInTypeName_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInTypeName_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = builtInTypeName_4_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!builtInTypeName_4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "builtInTypeName_4_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET RIGHT_BRACKET
  private static boolean builtInTypeName_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtInTypeName_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE /*endpointDeclaration**/ statement* RIGHT_BRACE
  public static boolean callableUnitBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callableUnitBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && callableUnitBody_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, CALLABLE_UNIT_BODY, r);
    return r;
  }

  // statement*
  private static boolean callableUnitBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callableUnitBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callableUnitBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // Identifier LEFT_PARENTHESIS parameterList? RIGHT_PARENTHESIS returnParameters?
  public static boolean callableUnitSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callableUnitSignature")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CALLABLE_UNIT_SIGNATURE, null);
    r = Identifier(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, LEFT_PARENTHESIS));
    r = p && report_error_(b, callableUnitSignature_2(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && callableUnitSignature_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // parameterList?
  private static boolean callableUnitSignature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callableUnitSignature_2")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // returnParameters?
  private static boolean callableUnitSignature_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callableUnitSignature_4")) return false;
    returnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // packageDeclaration? (importDeclaration /*| namespaceDeclaration*/)* (/*annotationAttachment**/ definition)*
  static boolean compilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compilationUnit_0(b, l + 1);
    r = r && compilationUnit_1(b, l + 1);
    r = r && compilationUnit_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // packageDeclaration?
  private static boolean compilationUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_0")) return false;
    packageDeclaration(b, l + 1);
    return true;
  }

  // (importDeclaration /*| namespaceDeclaration*/)*
  private static boolean compilationUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!compilationUnit_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (importDeclaration /*| namespaceDeclaration*/)
  private static boolean compilationUnit_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (/*annotationAttachment**/ definition)*
  private static boolean compilationUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!compilationUnit_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (/*annotationAttachment**/ definition)
  private static boolean compilationUnit_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // serviceDefinition | functionDefinition
  public static boolean definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = serviceDefinition(b, l + 1);
    if (!r) r = functionDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, TopLevelDefinitionRecover_parser_);
    return r;
  }

  /* ********************************************************** */
  // variableReference
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableReference(b, l + 1);
    exit_section_(b, m, EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  public static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && expressionList_1(b, l + 1);
    exit_section_(b, m, EXPRESSION_LIST, r);
    return r;
  }

  // (COMMA expression)*
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA expression
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variableReference SEMICOLON
  public static boolean expressionStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionStmt")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableReference(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, EXPRESSION_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // nativeFunctionDefinition | nonNativeFunctionDefinition
  public static boolean functionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DEFINITION, "<function definition>");
    r = nativeFunctionDefinition(b, l + 1);
    if (!r) r = nonNativeFunctionDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // nameReference LEFT_PARENTHESIS expressionList? RIGHT_PARENTHESIS
  public static boolean functionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionInvocation")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_INVOCATION, null);
    r = nameReference(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    p = r; // pin = 2
    r = r && report_error_(b, functionInvocation_2(b, l + 1));
    r = p && consumeToken(b, RIGHT_PARENTHESIS) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expressionList?
  private static boolean functionInvocation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionInvocation_2")) return false;
    expressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FUNCTION LEFT_PARENTHESIS (parameterList | typeList)? RIGHT_PARENTHESIS returnParameters?
  public static boolean functionTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeName")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, LEFT_PARENTHESIS);
    r = r && functionTypeName_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && functionTypeName_4(b, l + 1);
    exit_section_(b, m, FUNCTION_TYPE_NAME, r);
    return r;
  }

  // (parameterList | typeList)?
  private static boolean functionTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeName_2")) return false;
    functionTypeName_2_0(b, l + 1);
    return true;
  }

  // parameterList | typeList
  private static boolean functionTypeName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeName_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameterList(b, l + 1);
    if (!r) r = typeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // returnParameters?
  private static boolean functionTypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionTypeName_4")) return false;
    returnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IMPORT packageName (AS Identifier)? SEMICOLON
  public static boolean importDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATION, null);
    r = consumeToken(b, IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, packageName(b, l + 1));
    r = p && report_error_(b, importDeclaration_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (AS Identifier)?
  private static boolean importDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_2")) return false;
    importDeclaration_2_0(b, l + 1);
    return true;
  }

  // AS Identifier
  private static boolean importDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, AS);
    p = r; // pin = 1
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FUNCTION LEFT_PARENTHESIS parameterList? RIGHT_PARENTHESIS returnParameters? callableUnitBody
  public static boolean lambdaFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaFunction")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, LEFT_PARENTHESIS);
    r = r && lambdaFunction_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && lambdaFunction_4(b, l + 1);
    r = r && callableUnitBody(b, l + 1);
    exit_section_(b, m, LAMBDA_FUNCTION, r);
    return r;
  }

  // parameterList?
  private static boolean lambdaFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaFunction_2")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // returnParameters?
  private static boolean lambdaFunction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaFunction_4")) return false;
    returnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (Identifier COLON)? Identifier
  public static boolean nameReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nameReference")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nameReference_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, NAME_REFERENCE, r);
    return r;
  }

  // (Identifier COLON)?
  private static boolean nameReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nameReference_0")) return false;
    nameReference_0_0(b, l + 1);
    return true;
  }

  // Identifier COLON
  private static boolean nameReference_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nameReference_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PUBLIC)? NATIVE FUNCTION (LT parameter GT)? callableUnitSignature SEMICOLON
  public static boolean nativeFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nativeFunctionDefinition")) return false;
    if (!nextTokenIs(b, "<native function definition>", NATIVE, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NATIVE_FUNCTION_DEFINITION, "<native function definition>");
    r = nativeFunctionDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 1, NATIVE, FUNCTION);
    p = r; // pin = 2
    r = r && report_error_(b, nativeFunctionDefinition_3(b, l + 1));
    r = p && report_error_(b, callableUnitSignature(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (PUBLIC)?
  private static boolean nativeFunctionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nativeFunctionDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (LT parameter GT)?
  private static boolean nativeFunctionDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nativeFunctionDefinition_3")) return false;
    nativeFunctionDefinition_3_0(b, l + 1);
    return true;
  }

  // LT parameter GT
  private static boolean nativeFunctionDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nativeFunctionDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && parameter(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PUBLIC)? FUNCTION (LT parameter GT)? callableUnitSignature callableUnitBody
  public static boolean nonNativeFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNativeFunctionDefinition")) return false;
    if (!nextTokenIs(b, "<non native function definition>", FUNCTION, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NON_NATIVE_FUNCTION_DEFINITION, "<non native function definition>");
    r = nonNativeFunctionDefinition_0(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    p = r; // pin = 2
    r = r && report_error_(b, nonNativeFunctionDefinition_2(b, l + 1));
    r = p && report_error_(b, callableUnitSignature(b, l + 1)) && r;
    r = p && callableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (PUBLIC)?
  private static boolean nonNativeFunctionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNativeFunctionDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (LT parameter GT)?
  private static boolean nonNativeFunctionDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNativeFunctionDefinition_2")) return false;
    nonNativeFunctionDefinition_2_0(b, l + 1);
    return true;
  }

  // LT parameter GT
  private static boolean nonNativeFunctionDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNativeFunctionDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && parameter(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PACKAGE packageName SEMICOLON
  public static boolean packageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, null);
    r = consumeToken(b, PACKAGE);
    p = r; // pin = 1
    r = r && report_error_(b, packageName(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Identifier (DOT Identifier)* version?
  public static boolean packageName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageName")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, null);
    r = Identifier(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, packageName_1(b, l + 1));
    r = p && packageName_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (DOT Identifier)*
  private static boolean packageName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageName_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!packageName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "packageName_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT Identifier
  private static boolean packageName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageName_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DOT);
    p = r; // pin = 1
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // version?
  private static boolean packageName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageName_2")) return false;
    version(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // typeName Identifier
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = typeName(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // parameter (COMMA parameter)*
  public static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    r = parameter(b, l + 1);
    p = r; // pin = 1
    r = r && parameterList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA parameter)*
  private static boolean parameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!parameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // builtInReferenceTypeName | userDefineTypeName | anonStructTypeName
  public static boolean referenceTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "referenceTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REFERENCE_TYPE_NAME, "<reference type name>");
    r = builtInReferenceTypeName(b, l + 1);
    if (!r) r = userDefineTypeName(b, l + 1);
    if (!r) r = anonStructTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RESOURCE Identifier LEFT_PARENTHESIS parameterList RIGHT_PARENTHESIS callableUnitBody
  public static boolean resourceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resourceDefinition")) return false;
    if (!nextTokenIs(b, RESOURCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_DEFINITION, null);
    r = consumeToken(b, RESOURCE);
    p = r; // pin = 1
    r = r && report_error_(b, Identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_PARENTHESIS)) && r;
    r = p && report_error_(b, parameterList(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && callableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // RETURNS? LEFT_PARENTHESIS (parameterList | typeList) RIGHT_PARENTHESIS
  public static boolean returnParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnParameters")) return false;
    if (!nextTokenIs(b, "<return parameters>", LEFT_PARENTHESIS, RETURNS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_PARAMETERS, "<return parameters>");
    r = returnParameters_0(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && returnParameters_2(b, l + 1);
    p = r; // pin = 3
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RETURNS?
  private static boolean returnParameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnParameters_0")) return false;
    consumeToken(b, RETURNS);
    return true;
  }

  // parameterList | typeList
  private static boolean returnParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnParameters_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameterList(b, l + 1);
    if (!r) r = typeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE /*endpointDeclaration**/ variableDefinitionStatement* resourceDefinition* RIGHT_BRACE
  public static boolean serviceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "serviceBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && serviceBody_1(b, l + 1);
    r = r && serviceBody_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, SERVICE_BODY, r);
    return r;
  }

  // variableDefinitionStatement*
  private static boolean serviceBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "serviceBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variableDefinitionStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "serviceBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // resourceDefinition*
  private static boolean serviceBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "serviceBody_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!resourceDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "serviceBody_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // SERVICE (LT Identifier GT) Identifier serviceBody
  public static boolean serviceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "serviceDefinition")) return false;
    if (!nextTokenIs(b, SERVICE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_DEFINITION, null);
    r = consumeToken(b, SERVICE);
    p = r; // pin = 1
    r = r && report_error_(b, serviceDefinition_1(b, l + 1));
    r = p && report_error_(b, Identifier(b, l + 1)) && r;
    r = p && serviceBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LT Identifier GT
  private static boolean serviceDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "serviceDefinition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variableDefinitionStatement
  //     |   assignmentStatement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = variableDefinitionStatement(b, l + 1);
    if (!r) r = assignmentStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeName (COMMA typeName)*
  static boolean typeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = typeName(b, l + 1);
    p = r; // pin = 1
    r = r && typeList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA typeName)*
  private static boolean typeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!typeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA typeName
  private static boolean typeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && typeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE_ANY |TYPE_TYPE | valueTypeName | referenceTypeName /*| typeName*/ (LEFT_BRACKET RIGHT_BRACKET)+
  public static boolean typeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME, "<type name>");
    r = consumeToken(b, TYPE_ANY);
    if (!r) r = consumeToken(b, TYPE_TYPE);
    if (!r) r = valueTypeName(b, l + 1);
    if (!r) r = typeName_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // referenceTypeName /*| typeName*/ (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean typeName_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = referenceTypeName(b, l + 1);
    r = r && typeName_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean typeName_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeName_3_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!typeName_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeName_3_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET RIGHT_BRACKET
  private static boolean typeName_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // nameReference
  public static boolean userDefineTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "userDefineTypeName")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nameReference(b, l + 1);
    exit_section_(b, m, USER_DEFINE_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE_BOOL | TYPE_INT | TYPE_FLOAT | TYPE_STRING |TYPE_BLOB
  public static boolean valueTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_TYPE_NAME, "<value type name>");
    r = consumeToken(b, TYPE_BOOL);
    if (!r) r = consumeToken(b, TYPE_INT);
    if (!r) r = consumeToken(b, TYPE_FLOAT);
    if (!r) r = consumeToken(b, TYPE_STRING);
    if (!r) r = consumeToken(b, TYPE_BLOB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeName Identifier (ASSIGN expression)? SEMICOLON
  public static boolean variableDefinitionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION_STATEMENT, "<variable definition statement>");
    r = typeName(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && variableDefinitionStatement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ASSIGN expression)?
  private static boolean variableDefinitionStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionStatement_2")) return false;
    variableDefinitionStatement_2_0(b, l + 1);
    return true;
  }

  // ASSIGN expression
  private static boolean variableDefinitionStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // functionInvocation | nameReference
  public static boolean variableReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableReference")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionInvocation(b, l + 1);
    if (!r) r = nameReference(b, l + 1);
    exit_section_(b, m, VARIABLE_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // variableReference (COMMA variableReference)*
  public static boolean variableReferenceList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableReferenceList")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableReference(b, l + 1);
    r = r && variableReferenceList_1(b, l + 1);
    exit_section_(b, m, VARIABLE_REFERENCE_LIST, r);
    return r;
  }

  // (COMMA variableReference)*
  private static boolean variableReferenceList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableReferenceList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variableReferenceList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableReferenceList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA variableReference
  private static boolean variableReferenceList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableReferenceList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VERSION Identifier
  public static boolean version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "version")) return false;
    if (!nextTokenIs(b, VERSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VERSION, null);
    r = consumeToken(b, VERSION);
    p = r; // pin = 1
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  final static Parser TopLevelDefinitionRecover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TopLevelDefinitionRecover(b, l + 1);
    }
  };
}
