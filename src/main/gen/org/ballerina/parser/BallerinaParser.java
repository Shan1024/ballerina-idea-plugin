/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package org.ballerina.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.ballerina.psi.BallerinaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BallerinaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ANON_STRUCT_TYPE_NAME) {
      r = AnonStructTypeName(b, 0);
    }
    else if (t == ASSIGNMENT_STATEMENT) {
      r = AssignmentStatement(b, 0);
    }
    else if (t == BUILT_IN_REFERENCE_TYPE_NAME) {
      r = BuiltInReferenceTypeName(b, 0);
    }
    else if (t == BUILT_IN_TYPE_NAME) {
      r = BuiltInTypeName(b, 0);
    }
    else if (t == CALLABLE_UNIT_BODY) {
      r = CallableUnitBody(b, 0);
    }
    else if (t == CALLABLE_UNIT_SIGNATURE) {
      r = CallableUnitSignature(b, 0);
    }
    else if (t == DEFINITION) {
      r = Definition(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == EXPRESSION_LIST) {
      r = ExpressionList(b, 0);
    }
    else if (t == EXPRESSION_STMT) {
      r = ExpressionStmt(b, 0);
    }
    else if (t == FUNCTION_DEFINITION) {
      r = FunctionDefinition(b, 0);
    }
    else if (t == FUNCTION_INVOCATION) {
      r = FunctionInvocation(b, 0);
    }
    else if (t == FUNCTION_TYPE_NAME) {
      r = FunctionTypeName(b, 0);
    }
    else if (t == IMPORT_DECLARATION) {
      r = ImportDeclaration(b, 0);
    }
    else if (t == LAMBDA_FUNCTION) {
      r = LambdaFunction(b, 0);
    }
    else if (t == NAME_REFERENCE) {
      r = NameReference(b, 0);
    }
    else if (t == NATIVE_FUNCTION_DEFINITION) {
      r = NativeFunctionDefinition(b, 0);
    }
    else if (t == NON_NATIVE_FUNCTION_DEFINITION) {
      r = NonNativeFunctionDefinition(b, 0);
    }
    else if (t == PACKAGE_DECLARATION) {
      r = PackageDeclaration(b, 0);
    }
    else if (t == PACKAGE_NAME) {
      r = PackageName(b, 0);
    }
    else if (t == PARAMETER) {
      r = Parameter(b, 0);
    }
    else if (t == PARAMETER_LIST) {
      r = ParameterList(b, 0);
    }
    else if (t == REFERENCE_TYPE_NAME) {
      r = ReferenceTypeName(b, 0);
    }
    else if (t == RESOURCE_DEFINITION) {
      r = ResourceDefinition(b, 0);
    }
    else if (t == RETURN_PARAMETERS) {
      r = ReturnParameters(b, 0);
    }
    else if (t == SERVICE_BODY) {
      r = ServiceBody(b, 0);
    }
    else if (t == SERVICE_DEFINITION) {
      r = ServiceDefinition(b, 0);
    }
    else if (t == STATEMENT) {
      r = Statement(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = TypeName(b, 0);
    }
    else if (t == USER_DEFINE_TYPE_NAME) {
      r = UserDefineTypeName(b, 0);
    }
    else if (t == VALUE_TYPE_NAME) {
      r = ValueTypeName(b, 0);
    }
    else if (t == VARIABLE_DEFINITION_STATEMENT) {
      r = VariableDefinitionStatement(b, 0);
    }
    else if (t == VARIABLE_REFERENCE) {
      r = VariableReference(b, 0);
    }
    else if (t == VARIABLE_REFERENCE_LIST) {
      r = VariableReferenceList(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return CompilationUnit(b, l + 1);
  }

  /* ********************************************************** */
  // STRUCT structBody
  public static boolean AnonStructTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonStructTypeName")) return false;
    if (!nextTokenIs(b, STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRUCT, STRUCTBODY);
    exit_section_(b, m, ANON_STRUCT_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // (VAR)? VariableReferenceList ASSIGN Expression SEMICOLON
  public static boolean AssignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement")) return false;
    if (!nextTokenIs(b, "<assignment statement>", VAR, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STATEMENT, "<assignment statement>");
    r = AssignmentStatement_0(b, l + 1);
    r = r && VariableReferenceList(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (VAR)?
  private static boolean AssignmentStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement_0")) return false;
    consumeToken(b, VAR);
    return true;
  }

  /* ********************************************************** */
  // TYPE_MAP (LT TypeName GT)?
  //     |   TYPE_XML (LT (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)? xmlLocalName GT)?
  //     |   TYPE_JSON (LT NameReference GT)?
  //     |   TYPE_TABLE (LT NameReference GT)?
  //     |   FunctionTypeName
  public static boolean BuiltInReferenceTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_REFERENCE_TYPE_NAME, "<built in reference type name>");
    r = BuiltInReferenceTypeName_0(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName_1(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName_2(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName_3(b, l + 1);
    if (!r) r = FunctionTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TYPE_MAP (LT TypeName GT)?
  private static boolean BuiltInReferenceTypeName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_MAP);
    r = r && BuiltInReferenceTypeName_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT TypeName GT)?
  private static boolean BuiltInReferenceTypeName_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_0_1")) return false;
    BuiltInReferenceTypeName_0_1_0(b, l + 1);
    return true;
  }

  // LT TypeName GT
  private static boolean BuiltInReferenceTypeName_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeName(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_XML (LT (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)? xmlLocalName GT)?
  private static boolean BuiltInReferenceTypeName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_XML);
    r = r && BuiltInReferenceTypeName_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)? xmlLocalName GT)?
  private static boolean BuiltInReferenceTypeName_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1_1")) return false;
    BuiltInReferenceTypeName_1_1_0(b, l + 1);
    return true;
  }

  // LT (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)? xmlLocalName GT
  private static boolean BuiltInReferenceTypeName_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && BuiltInReferenceTypeName_1_1_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, XMLLOCALNAME, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACE xmlNamespaceName RIGHT_BRACE)?
  private static boolean BuiltInReferenceTypeName_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1_1_0_1")) return false;
    BuiltInReferenceTypeName_1_1_0_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACE xmlNamespaceName RIGHT_BRACE
  private static boolean BuiltInReferenceTypeName_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACE, XMLNAMESPACENAME, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_JSON (LT NameReference GT)?
  private static boolean BuiltInReferenceTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_JSON);
    r = r && BuiltInReferenceTypeName_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT NameReference GT)?
  private static boolean BuiltInReferenceTypeName_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_2_1")) return false;
    BuiltInReferenceTypeName_2_1_0(b, l + 1);
    return true;
  }

  // LT NameReference GT
  private static boolean BuiltInReferenceTypeName_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_TABLE (LT NameReference GT)?
  private static boolean BuiltInReferenceTypeName_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_TABLE);
    r = r && BuiltInReferenceTypeName_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT NameReference GT)?
  private static boolean BuiltInReferenceTypeName_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_3_1")) return false;
    BuiltInReferenceTypeName_3_1_0(b, l + 1);
    return true;
  }

  // LT NameReference GT
  private static boolean BuiltInReferenceTypeName_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInReferenceTypeName_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && NameReference(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE_ANY | TYPE_TYPE | ValueTypeName | BuiltInReferenceTypeName | TypeName (LEFT_BRACKET RIGHT_BRACKET)+
  public static boolean BuiltInTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_TYPE_NAME, "<built in type name>");
    r = consumeToken(b, TYPE_ANY);
    if (!r) r = consumeToken(b, TYPE_TYPE);
    if (!r) r = ValueTypeName(b, l + 1);
    if (!r) r = BuiltInReferenceTypeName(b, l + 1);
    if (!r) r = BuiltInTypeName_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypeName (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean BuiltInTypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName(b, l + 1);
    r = r && BuiltInTypeName_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean BuiltInTypeName_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BuiltInTypeName_4_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!BuiltInTypeName_4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BuiltInTypeName_4_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET RIGHT_BRACKET
  private static boolean BuiltInTypeName_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInTypeName_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE /*endpointDeclaration**/ Statement* RIGHT_BRACE
  public static boolean CallableUnitBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && CallableUnitBody_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, CALLABLE_UNIT_BODY, r);
    return r;
  }

  // Statement*
  private static boolean CallableUnitBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallableUnitBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // identifier LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS ReturnParameters?
  public static boolean CallableUnitSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitSignature")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CALLABLE_UNIT_SIGNATURE, null);
    r = consumeTokens(b, 1, IDENTIFIER, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, CallableUnitSignature_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && CallableUnitSignature_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ParameterList?
  private static boolean CallableUnitSignature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitSignature_2")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // ReturnParameters?
  private static boolean CallableUnitSignature_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallableUnitSignature_4")) return false;
    ReturnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PackageDeclaration? (ImportDeclaration /*| namespaceDeclaration*/)* (/*annotationAttachment**/ Definition)*
  static boolean CompilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CompilationUnit_0(b, l + 1);
    r = r && CompilationUnit_1(b, l + 1);
    r = r && CompilationUnit_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PackageDeclaration?
  private static boolean CompilationUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_0")) return false;
    PackageDeclaration(b, l + 1);
    return true;
  }

  // (ImportDeclaration /*| namespaceDeclaration*/)*
  private static boolean CompilationUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CompilationUnit_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompilationUnit_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (ImportDeclaration /*| namespaceDeclaration*/)
  private static boolean CompilationUnit_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (/*annotationAttachment**/ Definition)*
  private static boolean CompilationUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CompilationUnit_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompilationUnit_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (/*annotationAttachment**/ Definition)
  private static boolean CompilationUnit_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompilationUnit_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ServiceDefinition | FunctionDefinition
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = ServiceDefinition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, TopLevelDefinitionRecover_parser_);
    return r;
  }

  /* ********************************************************** */
  // VariableReference
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    exit_section_(b, m, EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // Expression (COMMA Expression)*
  public static boolean ExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && ExpressionList_1(b, l + 1);
    exit_section_(b, m, EXPRESSION_LIST, r);
    return r;
  }

  // (COMMA Expression)*
  private static boolean ExpressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ExpressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExpressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA Expression
  private static boolean ExpressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference SEMICOLON
  public static boolean ExpressionStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionStmt")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, EXPRESSION_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // NativeFunctionDefinition | NonNativeFunctionDefinition
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DEFINITION, "<function definition>");
    r = NativeFunctionDefinition(b, l + 1);
    if (!r) r = NonNativeFunctionDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NameReference LEFT_PARENTHESIS ExpressionList? RIGHT_PARENTHESIS
  public static boolean FunctionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_INVOCATION, null);
    r = NameReference(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    p = r; // pin = 2
    r = r && report_error_(b, FunctionInvocation_2(b, l + 1));
    r = p && consumeToken(b, RIGHT_PARENTHESIS) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionList?
  private static boolean FunctionInvocation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation_2")) return false;
    ExpressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FUNCTION LEFT_PARENTHESIS (ParameterList | TypeList)? RIGHT_PARENTHESIS ReturnParameters?
  public static boolean FunctionTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, LEFT_PARENTHESIS);
    r = r && FunctionTypeName_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && FunctionTypeName_4(b, l + 1);
    exit_section_(b, m, FUNCTION_TYPE_NAME, r);
    return r;
  }

  // (ParameterList | TypeList)?
  private static boolean FunctionTypeName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2")) return false;
    FunctionTypeName_2_0(b, l + 1);
    return true;
  }

  // ParameterList | TypeList
  private static boolean FunctionTypeName_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterList(b, l + 1);
    if (!r) r = TypeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ReturnParameters?
  private static boolean FunctionTypeName_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionTypeName_4")) return false;
    ReturnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IMPORT PackageName (AS identifier)? SEMICOLON
  public static boolean ImportDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATION, null);
    r = consumeToken(b, IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, PackageName(b, l + 1));
    r = p && report_error_(b, ImportDeclaration_2(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (AS identifier)?
  private static boolean ImportDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_2")) return false;
    ImportDeclaration_2_0(b, l + 1);
    return true;
  }

  // AS identifier
  private static boolean ImportDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclaration_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, AS, IDENTIFIER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // FUNCTION LEFT_PARENTHESIS ParameterList? RIGHT_PARENTHESIS ReturnParameters? CallableUnitBody
  public static boolean LambdaFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, LEFT_PARENTHESIS);
    r = r && LambdaFunction_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    r = r && LambdaFunction_4(b, l + 1);
    r = r && CallableUnitBody(b, l + 1);
    exit_section_(b, m, LAMBDA_FUNCTION, r);
    return r;
  }

  // ParameterList?
  private static boolean LambdaFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_2")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // ReturnParameters?
  private static boolean LambdaFunction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaFunction_4")) return false;
    ReturnParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (identifier COLON)? identifier
  public static boolean NameReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameReference_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, NAME_REFERENCE, r);
    return r;
  }

  // (identifier COLON)?
  private static boolean NameReference_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference_0")) return false;
    NameReference_0_0(b, l + 1);
    return true;
  }

  // identifier COLON
  private static boolean NameReference_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameReference_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PUBLIC)? NATIVE FUNCTION (LT Parameter GT)? CallableUnitSignature SEMICOLON
  public static boolean NativeFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition")) return false;
    if (!nextTokenIs(b, "<native function definition>", NATIVE, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NATIVE_FUNCTION_DEFINITION, "<native function definition>");
    r = NativeFunctionDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 2, NATIVE, FUNCTION);
    p = r; // pin = 3
    r = r && report_error_(b, NativeFunctionDefinition_3(b, l + 1));
    r = p && report_error_(b, CallableUnitSignature(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (PUBLIC)?
  private static boolean NativeFunctionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (LT Parameter GT)?
  private static boolean NativeFunctionDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition_3")) return false;
    NativeFunctionDefinition_3_0(b, l + 1);
    return true;
  }

  // LT Parameter GT
  private static boolean NativeFunctionDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeFunctionDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && Parameter(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PUBLIC)? FUNCTION (LT Parameter GT)? CallableUnitSignature CallableUnitBody
  public static boolean NonNativeFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition")) return false;
    if (!nextTokenIs(b, "<non native function definition>", FUNCTION, PUBLIC)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NON_NATIVE_FUNCTION_DEFINITION, "<non native function definition>");
    r = NonNativeFunctionDefinition_0(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    p = r; // pin = 2
    r = r && report_error_(b, NonNativeFunctionDefinition_2(b, l + 1));
    r = p && report_error_(b, CallableUnitSignature(b, l + 1)) && r;
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (PUBLIC)?
  private static boolean NonNativeFunctionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  // (LT Parameter GT)?
  private static boolean NonNativeFunctionDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition_2")) return false;
    NonNativeFunctionDefinition_2_0(b, l + 1);
    return true;
  }

  // LT Parameter GT
  private static boolean NonNativeFunctionDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NonNativeFunctionDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && Parameter(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // package PackageName SEMICOLON
  public static boolean PackageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, null);
    r = consumeToken(b, PACKAGE);
    p = r; // pin = 1
    r = r && report_error_(b, PackageName(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier (DOT identifier)* Version?
  public static boolean PackageName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, null);
    r = consumeToken(b, IDENTIFIER);
    p = r; // pin = 1
    r = r && report_error_(b, PackageName_1(b, l + 1));
    r = p && PackageName_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (DOT identifier)*
  private static boolean PackageName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageName_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PackageName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PackageName_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT identifier
  private static boolean PackageName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageName_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, DOT, IDENTIFIER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Version?
  private static boolean PackageName_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageName_2")) return false;
    Version(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TypeName identifier
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = TypeName(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Parameter (COMMA Parameter)*
  public static boolean ParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    r = Parameter(b, l + 1);
    p = r; // pin = 1
    r = r && ParameterList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA Parameter)*
  private static boolean ParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ParameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA Parameter
  private static boolean ParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BuiltInReferenceTypeName | UserDefineTypeName | AnonStructTypeName
  public static boolean ReferenceTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceTypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REFERENCE_TYPE_NAME, "<reference type name>");
    r = BuiltInReferenceTypeName(b, l + 1);
    if (!r) r = UserDefineTypeName(b, l + 1);
    if (!r) r = AnonStructTypeName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RESOURCE identifier LEFT_PARENTHESIS ParameterList RIGHT_PARENTHESIS CallableUnitBody
  public static boolean ResourceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ResourceDefinition")) return false;
    if (!nextTokenIs(b, RESOURCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_DEFINITION, null);
    r = consumeTokens(b, 1, RESOURCE, IDENTIFIER, LEFT_PARENTHESIS);
    p = r; // pin = 1
    r = r && report_error_(b, ParameterList(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RIGHT_PARENTHESIS)) && r;
    r = p && CallableUnitBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // RETURNS? LEFT_PARENTHESIS (ParameterList | TypeList) RIGHT_PARENTHESIS
  public static boolean ReturnParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnParameters")) return false;
    if (!nextTokenIs(b, "<return parameters>", LEFT_PARENTHESIS, RETURNS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_PARAMETERS, "<return parameters>");
    r = ReturnParameters_0(b, l + 1);
    r = r && consumeToken(b, LEFT_PARENTHESIS);
    r = r && ReturnParameters_2(b, l + 1);
    p = r; // pin = 3
    r = r && consumeToken(b, RIGHT_PARENTHESIS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RETURNS?
  private static boolean ReturnParameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnParameters_0")) return false;
    consumeToken(b, RETURNS);
    return true;
  }

  // ParameterList | TypeList
  private static boolean ReturnParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnParameters_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterList(b, l + 1);
    if (!r) r = TypeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE /*endpointDeclaration**/ VariableDefinitionStatement* ResourceDefinition* RIGHT_BRACE
  public static boolean ServiceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && ServiceBody_1(b, l + 1);
    r = r && ServiceBody_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, SERVICE_BODY, r);
    return r;
  }

  // VariableDefinitionStatement*
  private static boolean ServiceBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VariableDefinitionStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ResourceDefinition*
  private static boolean ServiceBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceBody_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ResourceDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ServiceBody_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // SERVICE (LT identifier GT) identifier ServiceBody
  public static boolean ServiceDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceDefinition")) return false;
    if (!nextTokenIs(b, SERVICE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_DEFINITION, null);
    r = consumeToken(b, SERVICE);
    p = r; // pin = 1
    r = r && report_error_(b, ServiceDefinition_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFIER)) && r;
    r = p && ServiceBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // LT identifier GT
  private static boolean ServiceDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ServiceDefinition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LT, IDENTIFIER, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableDefinitionStatement
  //     |   AssignmentStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = VariableDefinitionStatement(b, l + 1);
    if (!r) r = AssignmentStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // TypeName (COMMA TypeName)*
  static boolean TypeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = TypeName(b, l + 1);
    p = r; // pin = 1
    r = r && TypeList_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA TypeName)*
  private static boolean TypeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TypeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA TypeName
  private static boolean TypeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE_ANY |TYPE_TYPE | ValueTypeName | ReferenceTypeName /*| typeName*/ (LEFT_BRACKET RIGHT_BRACKET)+
  public static boolean TypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME, "<type name>");
    r = consumeToken(b, TYPE_ANY);
    if (!r) r = consumeToken(b, TYPE_TYPE);
    if (!r) r = ValueTypeName(b, l + 1);
    if (!r) r = TypeName_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ReferenceTypeName /*| typeName*/ (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean TypeName_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeName_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReferenceTypeName(b, l + 1);
    r = r && TypeName_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LEFT_BRACKET RIGHT_BRACKET)+
  private static boolean TypeName_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeName_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeName_3_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!TypeName_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeName_3_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET RIGHT_BRACKET
  private static boolean TypeName_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeName_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NameReference
  public static boolean UserDefineTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UserDefineTypeName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameReference(b, l + 1);
    exit_section_(b, m, USER_DEFINE_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE_BOOL | TYPE_INT | TYPE_FLOAT | TYPE_STRING |TYPE_BLOB
  public static boolean ValueTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueTypeName")) return false;
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
  // TypeName identifier (ASSIGN Expression)? SEMICOLON
  public static boolean VariableDefinitionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION_STATEMENT, "<variable definition statement>");
    r = TypeName(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && VariableDefinitionStatement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ASSIGN Expression)?
  private static boolean VariableDefinitionStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2")) return false;
    VariableDefinitionStatement_2_0(b, l + 1);
    return true;
  }

  // ASSIGN Expression
  private static boolean VariableDefinitionStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionInvocation | NameReference
  //     |   VariableReference index
  public static boolean VariableReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionInvocation(b, l + 1);
    if (!r) r = NameReference(b, l + 1);
    if (!r) r = VariableReference_2(b, l + 1);
    exit_section_(b, m, VARIABLE_REFERENCE, r);
    return r;
  }

  // VariableReference index
  private static boolean VariableReference_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReference_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && consumeToken(b, INDEX);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableReference (COMMA VariableReference)*
  public static boolean VariableReferenceList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableReference(b, l + 1);
    r = r && VariableReferenceList_1(b, l + 1);
    exit_section_(b, m, VARIABLE_REFERENCE_LIST, r);
    return r;
  }

  // (COMMA VariableReference)*
  private static boolean VariableReferenceList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!VariableReferenceList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableReferenceList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA VariableReference
  private static boolean VariableReferenceList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VariableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VERSION identifier
  static boolean Version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Version")) return false;
    if (!nextTokenIs(b, VERSION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, VERSION, IDENTIFIER);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  final static Parser TopLevelDefinitionRecover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TopLevelDefinitionRecover(b, l + 1);
    }
  };
}
