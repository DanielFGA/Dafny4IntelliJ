// This is a generated file. Not intended for manual editing.
package com.simpleplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static DafnyLanguage.psi.DafnyType.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DafnyParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADD_OP) {
      r = AddOp(b, 0);
    }
    else if (t == AND_OP) {
      r = AndOp(b, 0);
    }
    else if (t == ASSERT_STMT) {
      r = AssertStmt(b, 0);
    }
    else if (t == ASSIGN_RHS) {
      r = AssignRhs(b, 0);
    }
    else if (t == ASSIGN_STMT) {
      r = AssignStmt(b, 0);
    }
    else if (t == ASSUME_STMT) {
      r = AssumeStmt(b, 0);
    }
    else if (t == ATTRIBUTE) {
      r = Attribute(b, 0);
    }
    else if (t == ATTRIBUTE_ARG) {
      r = AttributeArg(b, 0);
    }
    else if (t == ATTRIBUTE_BODY) {
      r = AttributeBody(b, 0);
    }
    else if (t == ATTRIBUTE_OR_TRIGGER) {
      r = AttributeOrTrigger(b, 0);
    }
    else if (t == BLOCK_STMT) {
      r = BlockStmt(b, 0);
    }
    else if (t == CALL_STMT) {
      r = CallStmt(b, 0);
    }
    else if (t == CALL_STMT_SUB_EXPR) {
      r = CallStmtSubExpr(b, 0);
    }
    else if (t == CASE_EXPRESSION) {
      r = CaseExpression(b, 0);
    }
    else if (t == CASE_STATEMENT) {
      r = CaseStatement(b, 0);
    }
    else if (t == CLASS_DECL) {
      r = ClassDecl(b, 0);
    }
    else if (t == CLASS_MEMBER_DECL) {
      r = ClassMemberDecl(b, 0);
    }
    else if (t == CONST_ATOM_EXPRESSION) {
      r = ConstAtomExpression(b, 0);
    }
    else if (t == COUPLING_INV_DECL) {
      r = CouplingInvDecl(b, 0);
    }
    else if (t == DATATYPE_DECL) {
      r = DatatypeDecl(b, 0);
    }
    else if (t == DATATYPE_MEMBER_DECL) {
      r = DatatypeMemberDecl(b, 0);
    }
    else if (t == EQUIV_EXPRESSION) {
      r = EquivExpression(b, 0);
    }
    else if (t == EQUIV_OP) {
      r = EquivOp(b, 0);
    }
    else if (t == EXISTS) {
      r = Exists(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == EXPRESSIONS) {
      r = Expressions(b, 0);
    }
    else if (t == FACTOR) {
      r = Factor(b, 0);
    }
    else if (t == FIELD_DECL) {
      r = FieldDecl(b, 0);
    }
    else if (t == FORALL) {
      r = Forall(b, 0);
    }
    else if (t == FOREACH_STMT) {
      r = ForeachStmt(b, 0);
    }
    else if (t == FORMALS) {
      r = Formals(b, 0);
    }
    else if (t == FORMALS_OPTIONAL_IDS) {
      r = FormalsOptionalIds(b, 0);
    }
    else if (t == FRAME_EXPRESSION) {
      r = FrameExpression(b, 0);
    }
    else if (t == FUNCTION_BODY) {
      r = FunctionBody(b, 0);
    }
    else if (t == FUNCTION_DECL) {
      r = FunctionDecl(b, 0);
    }
    else if (t == FUNCTION_SPEC) {
      r = FunctionSpec(b, 0);
    }
    else if (t == G_IDENT_TYPE) {
      r = GIdentType(b, 0);
    }
    else if (t == GENERIC_INSTANTIATION) {
      r = GenericInstantiation(b, 0);
    }
    else if (t == GENERIC_PARAMETERS) {
      r = GenericParameters(b, 0);
    }
    else if (t == GUARD) {
      r = Guard(b, 0);
    }
    else if (t == HAVOC_STMT) {
      r = HavocStmt(b, 0);
    }
    else if (t == IDENT) {
      r = Ident(b, 0);
    }
    else if (t == IDENT_OR_FUNC_EXPRESSION) {
      r = IdentOrFuncExpression(b, 0);
    }
    else if (t == IDENT_TYPE) {
      r = IdentType(b, 0);
    }
    else if (t == IDENT_TYPE_OPTIONAL) {
      r = IdentTypeOptional(b, 0);
    }
    else if (t == IDENT_TYPE_RHS) {
      r = IdentTypeRhs(b, 0);
    }
    else if (t == IDENTS) {
      r = Idents(b, 0);
    }
    else if (t == IF_STMT) {
      r = IfStmt(b, 0);
    }
    else if (t == IMPLIES_EXPRESSION) {
      r = ImpliesExpression(b, 0);
    }
    else if (t == IMPLIES_OP) {
      r = ImpliesOp(b, 0);
    }
    else if (t == LHS_EXPR) {
      r = LhsExpr(b, 0);
    }
    else if (t == LOGICAL_EXPRESSION) {
      r = LogicalExpression(b, 0);
    }
    else if (t == MATCH_EXPRESSION) {
      r = MatchExpression(b, 0);
    }
    else if (t == MATCH_STMT) {
      r = MatchStmt(b, 0);
    }
    else if (t == METHOD_DECL) {
      r = MethodDecl(b, 0);
    }
    else if (t == METHOD_SPEC) {
      r = MethodSpec(b, 0);
    }
    else if (t == MUL_OP) {
      r = MulOp(b, 0);
    }
    else if (t == NAT) {
      r = Nat(b, 0);
    }
    else if (t == NEG_OP) {
      r = NegOp(b, 0);
    }
    else if (t == OBJECT_EXPRESSION) {
      r = ObjectExpression(b, 0);
    }
    else if (t == ONE_STMT) {
      r = OneStmt(b, 0);
    }
    else if (t == OR_OP) {
      r = OrOp(b, 0);
    }
    else if (t == POSSIBLY_WILD_EXPRESSION) {
      r = PossiblyWildExpression(b, 0);
    }
    else if (t == POSSIBLY_WILD_FRAME_EXPRESSION) {
      r = PossiblyWildFrameExpression(b, 0);
    }
    else if (t == PRINT_STMT) {
      r = PrintStmt(b, 0);
    }
    else if (t == Q_SEP) {
      r = QSep(b, 0);
    }
    else if (t == QUANTIFIER_GUTS) {
      r = QuantifierGuts(b, 0);
    }
    else if (t == REFERENCE_TYPE) {
      r = ReferenceType(b, 0);
    }
    else if (t == REL_OP) {
      r = RelOp(b, 0);
    }
    else if (t == RELATIONAL_EXPRESSION) {
      r = RelationalExpression(b, 0);
    }
    else if (t == SELECT_EXPRESSION) {
      r = SelectExpression(b, 0);
    }
    else if (t == SELECT_OR_CALL_SUFFIX) {
      r = SelectOrCallSuffix(b, 0);
    }
    else if (t == STMT) {
      r = Stmt(b, 0);
    }
    else if (t == TERM) {
      r = Term(b, 0);
    }
    else if (t == TYPE) {
      r = Type(b, 0);
    }
    else if (t == TYPE_AND_TOKEN) {
      r = TypeAndToken(b, 0);
    }
    else if (t == TYPE_IDENT_OPTIONAL) {
      r = TypeIdentOptional(b, 0);
    }
    else if (t == UNARY_EXPRESSION) {
      r = UnaryExpression(b, 0);
    }
    else if (t == USE_STMT) {
      r = UseStmt(b, 0);
    }
    else if (t == VAR_DECL_STMTS) {
      r = VarDeclStmts(b, 0);
    }
    else if (t == WHILE_STMT) {
      r = WhileStmt(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Dafny(b, l + 1);
  }

  /* ********************************************************** */
  // "+"
  //   | "-"
  public static boolean AddOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD_OP, "<add op>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "&&" | '\u2227'
  public static boolean AndOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_OP, "<and op>");
    r = consumeToken(b, "&&");
    if (!r) r = consumeToken(b, "\\u2227");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "assert"
  //   Expression ";"
  public static boolean AssertStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSERT_STMT, "<assert stmt>");
    r = consumeToken(b, "assert");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "new" TypeAndToken
  //    ( "[" Expression "]"
  //     )? | Expression
  public static boolean AssignRhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignRhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_RHS, "<assign rhs>");
    r = AssignRhs_0(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "new" TypeAndToken
  //    ( "[" Expression "]"
  //     )?
  private static boolean AssignRhs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignRhs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "new");
    r = r && TypeAndToken(b, l + 1);
    r = r && AssignRhs_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "[" Expression "]"
  //     )?
  private static boolean AssignRhs_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignRhs_0_2")) return false;
    AssignRhs_0_2_0(b, l + 1);
    return true;
  }

  // "[" Expression "]"
  private static boolean AssignRhs_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignRhs_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LhsExpr
  //   ":::="
  //   AssignRhs
  //   ";"
  public static boolean AssignStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_STMT, "<assign stmt>");
    r = LhsExpr(b, l + 1);
    r = r && consumeToken(b, ":::=");
    r = r && AssignRhs(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "assume"
  //   Expression ";"
  public static boolean AssumeStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssumeStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSUME_STMT, "<assume stmt>");
    r = consumeToken(b, "assume");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "{"
  //     AttributeBody
  //   "}"
  public static boolean Attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE, "<attribute>");
    r = consumeToken(b, "{");
    r = r && AttributeBody(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string
  //   | Expression
  public static boolean AttributeArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_ARG, "<attribute arg>");
    r = consumeToken(b, STRING);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ":" ident
  //  ( AttributeArg
  //    ( "," AttributeArg
  //     )*  )?
  public static boolean AttributeBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_BODY, "<attribute body>");
    r = consumeToken(b, ":");
    r = r && consumeToken(b, IDENT);
    r = r && AttributeBody_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( AttributeArg
  //    ( "," AttributeArg
  //     )*  )?
  private static boolean AttributeBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeBody_2")) return false;
    AttributeBody_2_0(b, l + 1);
    return true;
  }

  // AttributeArg
  //    ( "," AttributeArg
  //     )*
  private static boolean AttributeBody_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeBody_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AttributeArg(b, l + 1);
    r = r && AttributeBody_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," AttributeArg
  //     )*
  private static boolean AttributeBody_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeBody_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AttributeBody_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AttributeBody_2_0_1", c)) break;
    }
    return true;
  }

  // "," AttributeArg
  private static boolean AttributeBody_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeBody_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && AttributeArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{"
  //     ( AttributeBody
  //     |
  //       Expressions
  //     )
  //   "}"
  public static boolean AttributeOrTrigger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeOrTrigger")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_OR_TRIGGER, "<attribute or trigger>");
    r = consumeToken(b, "{");
    r = r && AttributeOrTrigger_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AttributeBody
  //     |
  //       Expressions
  private static boolean AttributeOrTrigger_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeOrTrigger_1")) return false;
    boolean r;
    r = AttributeBody(b, l + 1);
    if (!r) r = Expressions(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "{"
  //  ( Stmt
  //   )*  "}"
  public static boolean BlockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STMT, "<block stmt>");
    r = consumeToken(b, "{");
    r = r && BlockStmt_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Stmt
  //   )*
  private static boolean BlockStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BlockStmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockStmt_1", c)) break;
    }
    return true;
  }

  // ( Stmt
  //   )
  private static boolean BlockStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "call"
  //   CallStmtSubExpr
  //  ( ","                        /* call a,b,c, :::=  */
  //     Ident
  //    ( "," Ident
  //     )*    ":::="
  //     CallStmtSubExpr
  //   | ":::="                       /* call a :::=  */
  //     CallStmtSubExpr
  //   )? ";"
  public static boolean CallStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_STMT, "<call stmt>");
    r = consumeToken(b, "call");
    r = r && CallStmtSubExpr(b, l + 1);
    r = r && CallStmt_2(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ","                        /* call a,b,c, :::=  */
  //     Ident
  //    ( "," Ident
  //     )*    ":::="
  //     CallStmtSubExpr
  //   | ":::="                       /* call a :::=  */
  //     CallStmtSubExpr
  //   )?
  private static boolean CallStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmt_2")) return false;
    CallStmt_2_0(b, l + 1);
    return true;
  }

  // ","                        /* call a,b,c, :::=  */
  //     Ident
  //    ( "," Ident
  //     )*    ":::="
  //     CallStmtSubExpr
  //   | ":::="                       /* call a :::=  */
  //     CallStmtSubExpr
  private static boolean CallStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallStmt_2_0_0(b, l + 1);
    if (!r) r = CallStmt_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ","                        /* call a,b,c, :::=  */
  //     Ident
  //    ( "," Ident
  //     )*    ":::="
  //     CallStmtSubExpr
  private static boolean CallStmt_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmt_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Ident(b, l + 1);
    r = r && CallStmt_2_0_0_2(b, l + 1);
    r = r && consumeToken(b, ":::=");
    r = r && CallStmtSubExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," Ident
  //     )*
  private static boolean CallStmt_2_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmt_2_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CallStmt_2_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallStmt_2_0_0_2", c)) break;
    }
    return true;
  }

  // "," Ident
  private static boolean CallStmt_2_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmt_2_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ":::="                       /* call a :::=  */
  //     CallStmtSubExpr
  private static boolean CallStmt_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmt_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":::=");
    r = r && CallStmtSubExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( IdentOrFuncExpression
  //   | ObjectExpression
  //     SelectOrCallSuffix
  //   )
  //  ( SelectOrCallSuffix )*
  public static boolean CallStmtSubExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmtSubExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_STMT_SUB_EXPR, "<call stmt sub expr>");
    r = CallStmtSubExpr_0(b, l + 1);
    r = r && CallStmtSubExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IdentOrFuncExpression
  //   | ObjectExpression
  //     SelectOrCallSuffix
  private static boolean CallStmtSubExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmtSubExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentOrFuncExpression(b, l + 1);
    if (!r) r = CallStmtSubExpr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ObjectExpression
  //     SelectOrCallSuffix
  private static boolean CallStmtSubExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmtSubExpr_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectExpression(b, l + 1);
    r = r && SelectOrCallSuffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( SelectOrCallSuffix )*
  private static boolean CallStmtSubExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmtSubExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CallStmtSubExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallStmtSubExpr_1", c)) break;
    }
    return true;
  }

  // ( SelectOrCallSuffix )
  private static boolean CallStmtSubExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStmtSubExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectOrCallSuffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "case"
  //   Ident
  //  ( "("
  //     Ident
  //    ( "," Ident
  //     )*  ")" )? "::=>"
  //   Expression
  public static boolean CaseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_EXPRESSION, "<case expression>");
    r = consumeToken(b, "case");
    r = r && Ident(b, l + 1);
    r = r && CaseExpression_2(b, l + 1);
    r = r && consumeToken(b, "::=>");
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "("
  //     Ident
  //    ( "," Ident
  //     )*  ")" )?
  private static boolean CaseExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_2")) return false;
    CaseExpression_2_0(b, l + 1);
    return true;
  }

  // "("
  //     Ident
  //    ( "," Ident
  //     )*  ")"
  private static boolean CaseExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && Ident(b, l + 1);
    r = r && CaseExpression_2_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," Ident
  //     )*
  private static boolean CaseExpression_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseExpression_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseExpression_2_0_2", c)) break;
    }
    return true;
  }

  // "," Ident
  private static boolean CaseExpression_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "case"
  //   Ident
  //  ( "("
  //     Ident
  //    ( "," Ident
  //     )*  ")" )? "::=>"
  //    ( Stmt )*
  public static boolean CaseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_STATEMENT, "<case statement>");
    r = consumeToken(b, "case");
    r = r && Ident(b, l + 1);
    r = r && CaseStatement_2(b, l + 1);
    r = r && consumeToken(b, "::=>");
    r = r && CaseStatement_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "("
  //     Ident
  //    ( "," Ident
  //     )*  ")" )?
  private static boolean CaseStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_2")) return false;
    CaseStatement_2_0(b, l + 1);
    return true;
  }

  // "("
  //     Ident
  //    ( "," Ident
  //     )*  ")"
  private static boolean CaseStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && Ident(b, l + 1);
    r = r && CaseStatement_2_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," Ident
  //     )*
  private static boolean CaseStatement_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseStatement_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStatement_2_0_2", c)) break;
    }
    return true;
  }

  // "," Ident
  private static boolean CaseStatement_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Stmt )*
  private static boolean CaseStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseStatement_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStatement_4", c)) break;
    }
    return true;
  }

  // ( Stmt )
  private static boolean CaseStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "class"
  //  ( Attribute )*  Ident
  //  ( GenericParameters )?( "refines" Ident
  //   )? "{"
  //  ( ClassMemberDecl
  //   )*  "}"
  public static boolean ClassDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECL, "<class decl>");
    r = consumeToken(b, "class");
    r = r && ClassDecl_1(b, l + 1);
    r = r && Ident(b, l + 1);
    r = r && ClassDecl_3(b, l + 1);
    r = r && ClassDecl_4(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && ClassDecl_6(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Attribute )*
  private static boolean ClassDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDecl_1", c)) break;
    }
    return true;
  }

  // ( Attribute )
  private static boolean ClassDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GenericParameters )?
  private static boolean ClassDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_3")) return false;
    ClassDecl_3_0(b, l + 1);
    return true;
  }

  // ( GenericParameters )
  private static boolean ClassDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "refines" Ident
  //   )?
  private static boolean ClassDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_4")) return false;
    ClassDecl_4_0(b, l + 1);
    return true;
  }

  // "refines" Ident
  private static boolean ClassDecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "refines");
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ClassMemberDecl
  //   )*
  private static boolean ClassDecl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassDecl_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDecl_6", c)) break;
    }
    return true;
  }

  // ( ClassMemberDecl
  //   )
  private static boolean ClassDecl_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassMemberDecl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( "ghost"
  //   | "static"
  //   | "unlimited"
  //   )*  ( FieldDecl
  //   | FunctionDecl
  //   | MethodDecl
  //   | CouplingInvDecl
  //   )
  public static boolean ClassMemberDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassMemberDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER_DECL, "<class member decl>");
    r = ClassMemberDecl_0(b, l + 1);
    r = r && ClassMemberDecl_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "ghost"
  //   | "static"
  //   | "unlimited"
  //   )*
  private static boolean ClassMemberDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassMemberDecl_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassMemberDecl_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassMemberDecl_0", c)) break;
    }
    return true;
  }

  // "ghost"
  //   | "static"
  //   | "unlimited"
  private static boolean ClassMemberDecl_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassMemberDecl_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ghost");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "unlimited");
    exit_section_(b, m, null, r);
    return r;
  }

  // FieldDecl
  //   | FunctionDecl
  //   | MethodDecl
  //   | CouplingInvDecl
  private static boolean ClassMemberDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassMemberDecl_1")) return false;
    boolean r;
    r = FieldDecl(b, l + 1);
    if (!r) r = FunctionDecl(b, l + 1);
    if (!r) r = MethodDecl(b, l + 1);
    if (!r) r = CouplingInvDecl(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "false"
  //   | "true"
  //   | "null"
  //   | Nat
  //   | "#"
  //     Ident
  //     ""
  //     Ident
  //    ( "("
  //      ( Expressions )?   ")" )?
  //   | "fresh"
  //     "(" Expression ")"
  //   | "|"
  //       Expression
  //     "|"
  //   | "{"
  //      ( Expressions )?
  //     "}"
  //   | "["
  //      ( Expressions )?
  //     "]"
  public static boolean ConstAtomExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_ATOM_EXPRESSION, "<const atom expression>");
    r = consumeToken(b, "false");
    if (!r) r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "null");
    if (!r) r = Nat(b, l + 1);
    if (!r) r = ConstAtomExpression_4(b, l + 1);
    if (!r) r = ConstAtomExpression_5(b, l + 1);
    if (!r) r = ConstAtomExpression_6(b, l + 1);
    if (!r) r = ConstAtomExpression_7(b, l + 1);
    if (!r) r = ConstAtomExpression_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "#"
  //     Ident
  //     ""
  //     Ident
  //    ( "("
  //      ( Expressions )?   ")" )?
  private static boolean ConstAtomExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "#");
    r = r && Ident(b, l + 1);
    r = r && consumeToken(b, "");
    r = r && Ident(b, l + 1);
    r = r && ConstAtomExpression_4_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "("
  //      ( Expressions )?   ")" )?
  private static boolean ConstAtomExpression_4_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_4_4")) return false;
    ConstAtomExpression_4_4_0(b, l + 1);
    return true;
  }

  // "("
  //      ( Expressions )?   ")"
  private static boolean ConstAtomExpression_4_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_4_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && ConstAtomExpression_4_4_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Expressions )?
  private static boolean ConstAtomExpression_4_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_4_4_0_1")) return false;
    ConstAtomExpression_4_4_0_1_0(b, l + 1);
    return true;
  }

  // ( Expressions )
  private static boolean ConstAtomExpression_4_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_4_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "fresh"
  //     "(" Expression ")"
  private static boolean ConstAtomExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "fresh");
    r = r && consumeToken(b, "(");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // "|"
  //       Expression
  //     "|"
  private static boolean ConstAtomExpression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "|");
    exit_section_(b, m, null, r);
    return r;
  }

  // "{"
  //      ( Expressions )?
  //     "}"
  private static boolean ConstAtomExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && ConstAtomExpression_7_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Expressions )?
  private static boolean ConstAtomExpression_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_7_1")) return false;
    ConstAtomExpression_7_1_0(b, l + 1);
    return true;
  }

  // ( Expressions )
  private static boolean ConstAtomExpression_7_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_7_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "["
  //      ( Expressions )?
  //     "]"
  private static boolean ConstAtomExpression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && ConstAtomExpression_8_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Expressions )?
  private static boolean ConstAtomExpression_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_8_1")) return false;
    ConstAtomExpression_8_1_0(b, l + 1);
    return true;
  }

  // ( Expressions )
  private static boolean ConstAtomExpression_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_8_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "replaces"
  //  ( Attribute )*
  //   Ident
  //  ( "," Ident
  //   )*  "by"
  //   Expression
  //   ";"
  public static boolean CouplingInvDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CouplingInvDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COUPLING_INV_DECL, "<coupling inv decl>");
    r = consumeToken(b, "replaces");
    r = r && CouplingInvDecl_1(b, l + 1);
    r = r && Ident(b, l + 1);
    r = r && CouplingInvDecl_3(b, l + 1);
    r = r && consumeToken(b, "by");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Attribute )*
  private static boolean CouplingInvDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CouplingInvDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CouplingInvDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CouplingInvDecl_1", c)) break;
    }
    return true;
  }

  // ( Attribute )
  private static boolean CouplingInvDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CouplingInvDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," Ident
  //   )*
  private static boolean CouplingInvDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CouplingInvDecl_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CouplingInvDecl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CouplingInvDecl_3", c)) break;
    }
    return true;
  }

  // "," Ident
  private static boolean CouplingInvDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CouplingInvDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( "module"
  //    ( Attribute )*    Ident
  //    ( "imports" Idents )?
  //     "{"
  //      ( ClassDecl
  //       | DatatypeDecl
  //       )*
  //     "}"
  //   | ClassDecl
  //   | DatatypeDecl
  //   | ClassMemberDecl
  //   )*
  //   EOF
  static boolean Dafny(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Dafny_0(b, l + 1);
    r = r && consumeToken(b, EOF);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "module"
  //    ( Attribute )*    Ident
  //    ( "imports" Idents )?
  //     "{"
  //      ( ClassDecl
  //       | DatatypeDecl
  //       )*
  //     "}"
  //   | ClassDecl
  //   | DatatypeDecl
  //   | ClassMemberDecl
  //   )*
  private static boolean Dafny_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Dafny_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Dafny_0", c)) break;
    }
    return true;
  }

  // "module"
  //    ( Attribute )*    Ident
  //    ( "imports" Idents )?
  //     "{"
  //      ( ClassDecl
  //       | DatatypeDecl
  //       )*
  //     "}"
  //   | ClassDecl
  //   | DatatypeDecl
  //   | ClassMemberDecl
  private static boolean Dafny_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Dafny_0_0_0(b, l + 1);
    if (!r) r = ClassDecl(b, l + 1);
    if (!r) r = DatatypeDecl(b, l + 1);
    if (!r) r = ClassMemberDecl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "module"
  //    ( Attribute )*    Ident
  //    ( "imports" Idents )?
  //     "{"
  //      ( ClassDecl
  //       | DatatypeDecl
  //       )*
  //     "}"
  private static boolean Dafny_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "module");
    r = r && Dafny_0_0_0_1(b, l + 1);
    r = r && Ident(b, l + 1);
    r = r && Dafny_0_0_0_3(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && Dafny_0_0_0_5(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute )*
  private static boolean Dafny_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Dafny_0_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Dafny_0_0_0_1", c)) break;
    }
    return true;
  }

  // ( Attribute )
  private static boolean Dafny_0_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "imports" Idents )?
  private static boolean Dafny_0_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0_0_3")) return false;
    Dafny_0_0_0_3_0(b, l + 1);
    return true;
  }

  // "imports" Idents
  private static boolean Dafny_0_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "imports");
    r = r && Idents(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ClassDecl
  //       | DatatypeDecl
  //       )*
  private static boolean Dafny_0_0_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0_0_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Dafny_0_0_0_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Dafny_0_0_0_5", c)) break;
    }
    return true;
  }

  // ClassDecl
  //       | DatatypeDecl
  private static boolean Dafny_0_0_0_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0_0_5_0")) return false;
    boolean r;
    r = ClassDecl(b, l + 1);
    if (!r) r = DatatypeDecl(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "datatype"
  //  ( Attribute )*  Ident
  //  ( GenericParameters )? "{"
  //  ( DatatypeMemberDecl
  //   )*  "}"
  public static boolean DatatypeDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATATYPE_DECL, "<datatype decl>");
    r = consumeToken(b, "datatype");
    r = r && DatatypeDecl_1(b, l + 1);
    r = r && Ident(b, l + 1);
    r = r && DatatypeDecl_3(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && DatatypeDecl_5(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Attribute )*
  private static boolean DatatypeDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DatatypeDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DatatypeDecl_1", c)) break;
    }
    return true;
  }

  // ( Attribute )
  private static boolean DatatypeDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GenericParameters )?
  private static boolean DatatypeDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_3")) return false;
    DatatypeDecl_3_0(b, l + 1);
    return true;
  }

  // ( GenericParameters )
  private static boolean DatatypeDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DatatypeMemberDecl
  //   )*
  private static boolean DatatypeDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DatatypeDecl_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DatatypeDecl_5", c)) break;
    }
    return true;
  }

  // ( DatatypeMemberDecl
  //   )
  private static boolean DatatypeDecl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DatatypeMemberDecl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( Attribute )*  Ident
  //  ( GenericParameters )?
  //  ( FormalsOptionalIds )?
  //   ";"
  public static boolean DatatypeMemberDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATATYPE_MEMBER_DECL, "<datatype member decl>");
    r = DatatypeMemberDecl_0(b, l + 1);
    r = r && Ident(b, l + 1);
    r = r && DatatypeMemberDecl_2(b, l + 1);
    r = r && DatatypeMemberDecl_3(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Attribute )*
  private static boolean DatatypeMemberDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DatatypeMemberDecl_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DatatypeMemberDecl_0", c)) break;
    }
    return true;
  }

  // ( Attribute )
  private static boolean DatatypeMemberDecl_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GenericParameters )?
  private static boolean DatatypeMemberDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_2")) return false;
    DatatypeMemberDecl_2_0(b, l + 1);
    return true;
  }

  // ( GenericParameters )
  private static boolean DatatypeMemberDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FormalsOptionalIds )?
  private static boolean DatatypeMemberDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_3")) return false;
    DatatypeMemberDecl_3_0(b, l + 1);
    return true;
  }

  // ( FormalsOptionalIds )
  private static boolean DatatypeMemberDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalsOptionalIds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ImpliesExpression
  //  ( EquivOp
  //     ImpliesExpression
  //   )*
  public static boolean EquivExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EquivExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUIV_EXPRESSION, "<equiv expression>");
    r = ImpliesExpression(b, l + 1);
    r = r && EquivExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( EquivOp
  //     ImpliesExpression
  //   )*
  private static boolean EquivExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EquivExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EquivExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EquivExpression_1", c)) break;
    }
    return true;
  }

  // EquivOp
  //     ImpliesExpression
  private static boolean EquivExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EquivExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EquivOp(b, l + 1);
    r = r && ImpliesExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "" | '\u21d4'
  public static boolean EquivOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EquivOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUIV_OP, "<equiv op>");
    r = consumeToken(b, "");
    if (!r) r = consumeToken(b, "\\u21d4");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "exists" | '\u2203'
  public static boolean Exists(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exists")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXISTS, "<exists>");
    r = consumeToken(b, "exists");
    if (!r) r = consumeToken(b, "\\u2203");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "if"
  //     Expression
  //     "then" Expression
  //     "else" Expression
  //   | EquivExpression
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = Expression_0(b, l + 1);
    if (!r) r = EquivExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "if"
  //     Expression
  //     "then" Expression
  //     "else" Expression
  private static boolean Expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "if");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "then");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  //  ( "," Expression
  //   )*
  public static boolean Expressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expressions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSIONS, "<expressions>");
    r = Expression(b, l + 1);
    r = r && Expressions_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "," Expression
  //   )*
  private static boolean Expressions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expressions_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expressions_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expressions_1", c)) break;
    }
    return true;
  }

  // "," Expression
  private static boolean Expressions_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expressions_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UnaryExpression
  //  ( MulOp
  //     UnaryExpression
  //   )*
  public static boolean Factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = UnaryExpression(b, l + 1);
    r = r && Factor_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( MulOp
  //     UnaryExpression
  //   )*
  private static boolean Factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Factor_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Factor_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Factor_1", c)) break;
    }
    return true;
  }

  // MulOp
  //     UnaryExpression
  private static boolean Factor_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Factor_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MulOp(b, l + 1);
    r = r && UnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "var"
  //  ( Attribute )*  IdentType
  //  ( "," IdentType
  //   )*  ";"
  public static boolean FieldDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DECL, "<field decl>");
    r = consumeToken(b, "var");
    r = r && FieldDecl_1(b, l + 1);
    r = r && IdentType(b, l + 1);
    r = r && FieldDecl_3(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( Attribute )*
  private static boolean FieldDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FieldDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FieldDecl_1", c)) break;
    }
    return true;
  }

  // ( Attribute )
  private static boolean FieldDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," IdentType
  //   )*
  private static boolean FieldDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FieldDecl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FieldDecl_3", c)) break;
    }
    return true;
  }

  // "," IdentType
  private static boolean FieldDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && IdentType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "forall" | '\u2200'
  public static boolean Forall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Forall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORALL, "<forall>");
    r = consumeToken(b, "forall");
    if (!r) r = consumeToken(b, "\\u2200");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "foreach"
  //   "(" Ident
  //      ( ":" Type )?     "in" Expression
  //      ( "|" Expression )? ")"
  //   "{"
  //    ( AssertStmt
  //     | AssumeStmt
  //     | UseStmt
  //     )*    ( AssignStmt
  //     | HavocStmt
  //     )
  //   "}"
  public static boolean ForeachStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_STMT, "<foreach stmt>");
    r = consumeToken(b, "foreach");
    r = r && consumeToken(b, "(");
    r = r && Ident(b, l + 1);
    r = r && ForeachStmt_3(b, l + 1);
    r = r && consumeToken(b, "in");
    r = r && Expression(b, l + 1);
    r = r && ForeachStmt_6(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "{");
    r = r && ForeachStmt_9(b, l + 1);
    r = r && ForeachStmt_10(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ":" Type )?
  private static boolean ForeachStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStmt_3")) return false;
    ForeachStmt_3_0(b, l + 1);
    return true;
  }

  // ":" Type
  private static boolean ForeachStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "|" Expression )?
  private static boolean ForeachStmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStmt_6")) return false;
    ForeachStmt_6_0(b, l + 1);
    return true;
  }

  // "|" Expression
  private static boolean ForeachStmt_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStmt_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AssertStmt
  //     | AssumeStmt
  //     | UseStmt
  //     )*
  private static boolean ForeachStmt_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStmt_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ForeachStmt_9_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForeachStmt_9", c)) break;
    }
    return true;
  }

  // AssertStmt
  //     | AssumeStmt
  //     | UseStmt
  private static boolean ForeachStmt_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStmt_9_0")) return false;
    boolean r;
    r = AssertStmt(b, l + 1);
    if (!r) r = AssumeStmt(b, l + 1);
    if (!r) r = UseStmt(b, l + 1);
    return r;
  }

  // AssignStmt
  //     | HavocStmt
  private static boolean ForeachStmt_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStmt_10")) return false;
    boolean r;
    r = AssignStmt(b, l + 1);
    if (!r) r = HavocStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "("
  //  (
  //     GIdentType
  //    ( "," GIdentType
  //     )*  )? ")"
  public static boolean Formals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMALS, "<formals>");
    r = consumeToken(b, "(");
    r = r && Formals_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //     GIdentType
  //    ( "," GIdentType
  //     )*  )?
  private static boolean Formals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals_1")) return false;
    Formals_1_0(b, l + 1);
    return true;
  }

  // GIdentType
  //    ( "," GIdentType
  //     )*
  private static boolean Formals_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GIdentType(b, l + 1);
    r = r && Formals_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," GIdentType
  //     )*
  private static boolean Formals_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Formals_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Formals_1_0_1", c)) break;
    }
    return true;
  }

  // "," GIdentType
  private static boolean Formals_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && GIdentType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "("
  //  (
  //     TypeIdentOptional
  //    ( "," TypeIdentOptional
  //     )*  )? ")"
  public static boolean FormalsOptionalIds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMALS_OPTIONAL_IDS, "<formals optional ids>");
    r = consumeToken(b, "(");
    r = r && FormalsOptionalIds_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //     TypeIdentOptional
  //    ( "," TypeIdentOptional
  //     )*  )?
  private static boolean FormalsOptionalIds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds_1")) return false;
    FormalsOptionalIds_1_0(b, l + 1);
    return true;
  }

  // TypeIdentOptional
  //    ( "," TypeIdentOptional
  //     )*
  private static boolean FormalsOptionalIds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeIdentOptional(b, l + 1);
    r = r && FormalsOptionalIds_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," TypeIdentOptional
  //     )*
  private static boolean FormalsOptionalIds_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FormalsOptionalIds_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FormalsOptionalIds_1_0_1", c)) break;
    }
    return true;
  }

  // "," TypeIdentOptional
  private static boolean FormalsOptionalIds_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && TypeIdentOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression
  //  ( "`" Ident
  //   )?
  public static boolean FrameExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FrameExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FRAME_EXPRESSION, "<frame expression>");
    r = Expression(b, l + 1);
    r = r && FrameExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "`" Ident
  //   )?
  private static boolean FrameExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FrameExpression_1")) return false;
    FrameExpression_1_0(b, l + 1);
    return true;
  }

  // "`" Ident
  private static boolean FrameExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FrameExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "`");
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{"
  //   ( MatchExpression
  //   | Expression
  //   )
  //   "}"
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    r = consumeToken(b, "{");
    r = r && FunctionBody_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MatchExpression
  //   | Expression
  private static boolean FunctionBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody_1")) return false;
    boolean r;
    r = MatchExpression(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "function"
  //  ( "method"
  //   )?
  //  ( Attribute )*  Ident
  //  ( GenericParameters )?
  //   Formals
  //   ":"
  //   Type
  //   ( ";"
  //    ( FunctionSpec )*  |( FunctionSpec )*    FunctionBody
  //   )
  public static boolean FunctionDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECL, "<function decl>");
    r = consumeToken(b, "function");
    r = r && FunctionDecl_1(b, l + 1);
    r = r && FunctionDecl_2(b, l + 1);
    r = r && Ident(b, l + 1);
    r = r && FunctionDecl_4(b, l + 1);
    r = r && Formals(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && Type(b, l + 1);
    r = r && FunctionDecl_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "method"
  //   )?
  private static boolean FunctionDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1")) return false;
    FunctionDecl_1_0(b, l + 1);
    return true;
  }

  // ( "method"
  //   )
  private static boolean FunctionDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "method");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute )*
  private static boolean FunctionDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDecl_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDecl_2", c)) break;
    }
    return true;
  }

  // ( Attribute )
  private static boolean FunctionDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GenericParameters )?
  private static boolean FunctionDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_4")) return false;
    FunctionDecl_4_0(b, l + 1);
    return true;
  }

  // ( GenericParameters )
  private static boolean FunctionDecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ";"
  //    ( FunctionSpec )*  |( FunctionSpec )*    FunctionBody
  private static boolean FunctionDecl_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_8_0(b, l + 1);
    if (!r) r = FunctionDecl_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ";"
  //    ( FunctionSpec )*
  private static boolean FunctionDecl_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && FunctionDecl_8_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FunctionSpec )*
  private static boolean FunctionDecl_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_8_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDecl_8_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDecl_8_0_1", c)) break;
    }
    return true;
  }

  // ( FunctionSpec )
  private static boolean FunctionDecl_8_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_8_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FunctionSpec )*    FunctionBody
  private static boolean FunctionDecl_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_8_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_8_1_0(b, l + 1);
    r = r && FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FunctionSpec )*
  private static boolean FunctionDecl_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_8_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDecl_8_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDecl_8_1_0", c)) break;
    }
    return true;
  }

  // ( FunctionSpec )
  private static boolean FunctionDecl_8_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_8_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "requires" Expression ";"
  //   | "reads"( PossiblyWildFrameExpression
  //              ( "," PossiblyWildFrameExpression
  //               )*	        )?";"
  //   | "decreases" Expressions ";"
  public static boolean FunctionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_SPEC, "<function spec>");
    r = FunctionSpec_0(b, l + 1);
    if (!r) r = FunctionSpec_1(b, l + 1);
    if (!r) r = FunctionSpec_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "requires" Expression ";"
  private static boolean FunctionSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "requires");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // "reads"( PossiblyWildFrameExpression
  //              ( "," PossiblyWildFrameExpression
  //               )*	        )?";"
  private static boolean FunctionSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "reads");
    r = r && FunctionSpec_1_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PossiblyWildFrameExpression
  //              ( "," PossiblyWildFrameExpression
  //               )*	        )?
  private static boolean FunctionSpec_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_1_1")) return false;
    FunctionSpec_1_1_0(b, l + 1);
    return true;
  }

  // PossiblyWildFrameExpression
  //              ( "," PossiblyWildFrameExpression
  //               )*
  private static boolean FunctionSpec_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PossiblyWildFrameExpression(b, l + 1);
    r = r && FunctionSpec_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," PossiblyWildFrameExpression
  //               )*
  private static boolean FunctionSpec_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionSpec_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionSpec_1_1_0_1", c)) break;
    }
    return true;
  }

  // "," PossiblyWildFrameExpression
  private static boolean FunctionSpec_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && PossiblyWildFrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "decreases" Expressions ";"
  private static boolean FunctionSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "decreases");
    r = r && Expressions(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( "ghost"
  //   )? IdentType
  public static boolean GIdentType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GIdentType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_IDENT_TYPE, "<g ident type>");
    r = GIdentType_0(b, l + 1);
    r = r && IdentType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "ghost"
  //   )?
  private static boolean GIdentType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GIdentType_0")) return false;
    GIdentType_0_0(b, l + 1);
    return true;
  }

  // ( "ghost"
  //   )
  private static boolean GIdentType_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GIdentType_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ghost");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "<"
  //     Type
  //    ( "," Type
  //     )*  ">"
  public static boolean GenericInstantiation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInstantiation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_INSTANTIATION, "<generic instantiation>");
    r = consumeToken(b, "<");
    r = r && Type(b, l + 1);
    r = r && GenericInstantiation_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "," Type
  //     )*
  private static boolean GenericInstantiation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInstantiation_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericInstantiation_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericInstantiation_2", c)) break;
    }
    return true;
  }

  // "," Type
  private static boolean GenericInstantiation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInstantiation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "<"
  //   Ident
  //  ( "," Ident
  //   )*  ">"
  public static boolean GenericParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_PARAMETERS, "<generic parameters>");
    r = consumeToken(b, "<");
    r = r && Ident(b, l + 1);
    r = r && GenericParameters_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "," Ident
  //   )*
  private static boolean GenericParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericParameters_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericParameters_2", c)) break;
    }
    return true;
  }

  // "," Ident
  private static boolean GenericParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "("
  //   ( "*"
  //   | Expression
  //   )
  //   ")"
  public static boolean Guard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Guard")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GUARD, "<guard>");
    r = consumeToken(b, "(");
    r = r && Guard_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "*"
  //   | Expression
  private static boolean Guard_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Guard_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "havoc"
  //   LhsExpr ";"
  public static boolean HavocStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HavocStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HAVOC_STMT, "<havoc stmt>");
    r = consumeToken(b, "havoc");
    r = r && LhsExpr(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ident
  public static boolean Ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ident")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // Ident
  //  ( "("
  //      ( Expressions )?   ")"
  //   )?
  public static boolean IdentOrFuncExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentOrFuncExpression")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && IdentOrFuncExpression_1(b, l + 1);
    exit_section_(b, m, IDENT_OR_FUNC_EXPRESSION, r);
    return r;
  }

  // ( "("
  //      ( Expressions )?   ")"
  //   )?
  private static boolean IdentOrFuncExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentOrFuncExpression_1")) return false;
    IdentOrFuncExpression_1_0(b, l + 1);
    return true;
  }

  // "("
  //      ( Expressions )?   ")"
  private static boolean IdentOrFuncExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentOrFuncExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && IdentOrFuncExpression_1_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Expressions )?
  private static boolean IdentOrFuncExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentOrFuncExpression_1_0_1")) return false;
    IdentOrFuncExpression_1_0_1_0(b, l + 1);
    return true;
  }

  // ( Expressions )
  private static boolean IdentOrFuncExpression_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentOrFuncExpression_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident
  //   ":"
  //   Type
  public static boolean IdentType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentType")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && Type(b, l + 1);
    exit_section_(b, m, IDENT_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // Ident
  //  ( ":" Type
  //   )?
  public static boolean IdentTypeOptional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeOptional")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && IdentTypeOptional_1(b, l + 1);
    exit_section_(b, m, IDENT_TYPE_OPTIONAL, r);
    return r;
  }

  // ( ":" Type
  //   )?
  private static boolean IdentTypeOptional_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeOptional_1")) return false;
    IdentTypeOptional_1_0(b, l + 1);
    return true;
  }

  // ":" Type
  private static boolean IdentTypeOptional_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeOptional_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident
  //  ( ":" Type
  //   )?( ":::="
  //     AssignRhs
  //   )?
  public static boolean IdentTypeRhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeRhs")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && IdentTypeRhs_1(b, l + 1);
    r = r && IdentTypeRhs_2(b, l + 1);
    exit_section_(b, m, IDENT_TYPE_RHS, r);
    return r;
  }

  // ( ":" Type
  //   )?
  private static boolean IdentTypeRhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeRhs_1")) return false;
    IdentTypeRhs_1_0(b, l + 1);
    return true;
  }

  // ":" Type
  private static boolean IdentTypeRhs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeRhs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ":::="
  //     AssignRhs
  //   )?
  private static boolean IdentTypeRhs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeRhs_2")) return false;
    IdentTypeRhs_2_0(b, l + 1);
    return true;
  }

  // ":::="
  //     AssignRhs
  private static boolean IdentTypeRhs_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeRhs_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":::=");
    r = r && AssignRhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident
  //  ( "," Ident
  //   )*
  public static boolean Idents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Idents")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && Idents_1(b, l + 1);
    exit_section_(b, m, IDENTS, r);
    return r;
  }

  // ( "," Ident
  //   )*
  private static boolean Idents_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Idents_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Idents_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Idents_1", c)) break;
    }
    return true;
  }

  // "," Ident
  private static boolean Idents_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Idents_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "if"
  //   Guard
  //   BlockStmt
  //  ( "else"
  //     ( IfStmt
  //     | BlockStmt
  //     )
  //   )?
  public static boolean IfStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STMT, "<if stmt>");
    r = consumeToken(b, "if");
    r = r && Guard(b, l + 1);
    r = r && BlockStmt(b, l + 1);
    r = r && IfStmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "else"
  //     ( IfStmt
  //     | BlockStmt
  //     )
  //   )?
  private static boolean IfStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_3")) return false;
    IfStmt_3_0(b, l + 1);
    return true;
  }

  // "else"
  //     ( IfStmt
  //     | BlockStmt
  //     )
  private static boolean IfStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && IfStmt_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfStmt
  //     | BlockStmt
  private static boolean IfStmt_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_3_0_1")) return false;
    boolean r;
    r = IfStmt(b, l + 1);
    if (!r) r = BlockStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LogicalExpression
  //  ( ImpliesOp
  //     ImpliesExpression
  //   )?
  public static boolean ImpliesExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPLIES_EXPRESSION, "<implies expression>");
    r = LogicalExpression(b, l + 1);
    r = r && ImpliesExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ImpliesOp
  //     ImpliesExpression
  //   )?
  private static boolean ImpliesExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpression_1")) return false;
    ImpliesExpression_1_0(b, l + 1);
    return true;
  }

  // ImpliesOp
  //     ImpliesExpression
  private static boolean ImpliesExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImpliesOp(b, l + 1);
    r = r && ImpliesExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "::=::=>" | '\u21d2'
  public static boolean ImpliesOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPLIES_OP, "<implies op>");
    r = consumeToken(b, "::=::=>");
    if (!r) r = consumeToken(b, "\\u21d2");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SelectExpression
  public static boolean LhsExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LhsExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LHS_EXPR, "<lhs expr>");
    r = SelectExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RelationalExpression
  //  ( AndOp
  //     RelationalExpression
  //    ( AndOp
  //       RelationalExpression
  //     )*  | OrOp
  //     RelationalExpression
  //    ( OrOp
  //       RelationalExpression
  //     )*  )?
  public static boolean LogicalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_EXPRESSION, "<logical expression>");
    r = RelationalExpression(b, l + 1);
    r = r && LogicalExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( AndOp
  //     RelationalExpression
  //    ( AndOp
  //       RelationalExpression
  //     )*  | OrOp
  //     RelationalExpression
  //    ( OrOp
  //       RelationalExpression
  //     )*  )?
  private static boolean LogicalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1")) return false;
    LogicalExpression_1_0(b, l + 1);
    return true;
  }

  // AndOp
  //     RelationalExpression
  //    ( AndOp
  //       RelationalExpression
  //     )*  | OrOp
  //     RelationalExpression
  //    ( OrOp
  //       RelationalExpression
  //     )*
  private static boolean LogicalExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LogicalExpression_1_0_0(b, l + 1);
    if (!r) r = LogicalExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AndOp
  //     RelationalExpression
  //    ( AndOp
  //       RelationalExpression
  //     )*
  private static boolean LogicalExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    r = r && LogicalExpression_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AndOp
  //       RelationalExpression
  //     )*
  private static boolean LogicalExpression_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LogicalExpression_1_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LogicalExpression_1_0_0_2", c)) break;
    }
    return true;
  }

  // AndOp
  //       RelationalExpression
  private static boolean LogicalExpression_1_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OrOp
  //     RelationalExpression
  //    ( OrOp
  //       RelationalExpression
  //     )*
  private static boolean LogicalExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    r = r && LogicalExpression_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( OrOp
  //       RelationalExpression
  //     )*
  private static boolean LogicalExpression_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_0_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LogicalExpression_1_0_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LogicalExpression_1_0_1_2", c)) break;
    }
    return true;
  }

  // OrOp
  //       RelationalExpression
  private static boolean LogicalExpression_1_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "match"
  //   Expression
  //  ( CaseExpression
  //   )*
  public static boolean MatchExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_EXPRESSION, "<match expression>");
    r = consumeToken(b, "match");
    r = r && Expression(b, l + 1);
    r = r && MatchExpression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( CaseExpression
  //   )*
  private static boolean MatchExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MatchExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchExpression_2", c)) break;
    }
    return true;
  }

  // ( CaseExpression
  //   )
  private static boolean MatchExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "match"
  //   Expression
  //   "{"
  //  ( CaseStatement
  //   )*  "}"
  public static boolean MatchStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_STMT, "<match stmt>");
    r = consumeToken(b, "match");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && MatchStmt_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( CaseStatement
  //   )*
  private static boolean MatchStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MatchStmt_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchStmt_3", c)) break;
    }
    return true;
  }

  // ( CaseStatement
  //   )
  private static boolean MatchStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( "method"
  //   | "refines"
  //   )
  //  ( Attribute )*  Ident
  //  ( GenericParameters )?
  //   Formals
  //  ( "returns"
  //     Formals
  //   )? ( ";"( MethodSpec )*  |( MethodSpec )*BlockStmt
  //   )
  public static boolean MethodDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECL, "<method decl>");
    r = MethodDecl_0(b, l + 1);
    r = r && MethodDecl_1(b, l + 1);
    r = r && Ident(b, l + 1);
    r = r && MethodDecl_3(b, l + 1);
    r = r && Formals(b, l + 1);
    r = r && MethodDecl_5(b, l + 1);
    r = r && MethodDecl_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "method"
  //   | "refines"
  private static boolean MethodDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "method");
    if (!r) r = consumeToken(b, "refines");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute )*
  private static boolean MethodDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodDecl_1", c)) break;
    }
    return true;
  }

  // ( Attribute )
  private static boolean MethodDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GenericParameters )?
  private static boolean MethodDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3")) return false;
    MethodDecl_3_0(b, l + 1);
    return true;
  }

  // ( GenericParameters )
  private static boolean MethodDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "returns"
  //     Formals
  //   )?
  private static boolean MethodDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_5")) return false;
    MethodDecl_5_0(b, l + 1);
    return true;
  }

  // "returns"
  //     Formals
  private static boolean MethodDecl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "returns");
    r = r && Formals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ";"( MethodSpec )*  |( MethodSpec )*BlockStmt
  private static boolean MethodDecl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodDecl_6_0(b, l + 1);
    if (!r) r = MethodDecl_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ";"( MethodSpec )*
  private static boolean MethodDecl_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && MethodDecl_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( MethodSpec )*
  private static boolean MethodDecl_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_6_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodDecl_6_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodDecl_6_0_1", c)) break;
    }
    return true;
  }

  // ( MethodSpec )
  private static boolean MethodDecl_6_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_6_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( MethodSpec )*BlockStmt
  private static boolean MethodDecl_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodDecl_6_1_0(b, l + 1);
    r = r && BlockStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( MethodSpec )*
  private static boolean MethodDecl_6_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_6_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodDecl_6_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodDecl_6_1_0", c)) break;
    }
    return true;
  }

  // ( MethodSpec )
  private static boolean MethodDecl_6_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_6_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "modifies"( FrameExpression
  //                 ( "," FrameExpression
  //                  )*               )?";"
  //   |( "free"
  //     )?   ( "requires" Expression ";"
  //     | "ensures" Expression ";"
  //     )
  //   | "decreases" Expressions ";"
  public static boolean MethodSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_SPEC, "<method spec>");
    r = MethodSpec_0(b, l + 1);
    if (!r) r = MethodSpec_1(b, l + 1);
    if (!r) r = MethodSpec_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "modifies"( FrameExpression
  //                 ( "," FrameExpression
  //                  )*               )?";"
  private static boolean MethodSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "modifies");
    r = r && MethodSpec_0_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FrameExpression
  //                 ( "," FrameExpression
  //                  )*               )?
  private static boolean MethodSpec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0_1")) return false;
    MethodSpec_0_1_0(b, l + 1);
    return true;
  }

  // FrameExpression
  //                 ( "," FrameExpression
  //                  )*
  private static boolean MethodSpec_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FrameExpression(b, l + 1);
    r = r && MethodSpec_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," FrameExpression
  //                  )*
  private static boolean MethodSpec_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodSpec_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodSpec_0_1_0_1", c)) break;
    }
    return true;
  }

  // "," FrameExpression
  private static boolean MethodSpec_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && FrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "free"
  //     )?   ( "requires" Expression ";"
  //     | "ensures" Expression ";"
  //     )
  private static boolean MethodSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodSpec_1_0(b, l + 1);
    r = r && MethodSpec_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "free"
  //     )?
  private static boolean MethodSpec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_0")) return false;
    MethodSpec_1_0_0(b, l + 1);
    return true;
  }

  // ( "free"
  //     )
  private static boolean MethodSpec_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "free");
    exit_section_(b, m, null, r);
    return r;
  }

  // "requires" Expression ";"
  //     | "ensures" Expression ";"
  private static boolean MethodSpec_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodSpec_1_1_0(b, l + 1);
    if (!r) r = MethodSpec_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "requires" Expression ";"
  private static boolean MethodSpec_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "requires");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // "ensures" Expression ";"
  private static boolean MethodSpec_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ensures");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // "decreases" Expressions ";"
  private static boolean MethodSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "decreases");
    r = r && Expressions(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "*"
  //   | "/"
  //   | "%"
  public static boolean MulOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MUL_OP, "<mul op>");
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // digits
  public static boolean Nat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Nat")) return false;
    if (!nextTokenIs(b, DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIGITS);
    exit_section_(b, m, NAT, r);
    return r;
  }

  /* ********************************************************** */
  // "!" | '\u00ac'
  public static boolean NegOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NegOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEG_OP, "<neg op>");
    r = consumeToken(b, "!");
    if (!r) r = consumeToken(b, "\\u00ac");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "this"
  //   | "old"
  //     "("
  //       Expression
  //     ")"
  //   | "(" ( QuantifierGuts
  //         | Expression
  //         )
  //     ")"
  public static boolean ObjectExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_EXPRESSION, "<object expression>");
    r = consumeToken(b, "this");
    if (!r) r = ObjectExpression_1(b, l + 1);
    if (!r) r = ObjectExpression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "old"
  //     "("
  //       Expression
  //     ")"
  private static boolean ObjectExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "old");
    r = r && consumeToken(b, "(");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" ( QuantifierGuts
  //         | Expression
  //         )
  //     ")"
  private static boolean ObjectExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && ObjectExpression_2_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // QuantifierGuts
  //         | Expression
  private static boolean ObjectExpression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_2_1")) return false;
    boolean r;
    r = QuantifierGuts(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // AssertStmt
  //   | AssumeStmt
  //   | UseStmt
  //   | PrintStmt
  //   | AssignStmt
  //   | HavocStmt
  //   | CallStmt
  //   | IfStmt
  //   | WhileStmt
  //   | MatchStmt
  //   | ForeachStmt
  //   | "label"
  //     Ident ":"
  //   | "break"
  //    ( Ident
  //     )?";"
  //   | "return"
  //     ";"
  public static boolean OneStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ONE_STMT, "<one stmt>");
    r = AssertStmt(b, l + 1);
    if (!r) r = AssumeStmt(b, l + 1);
    if (!r) r = UseStmt(b, l + 1);
    if (!r) r = PrintStmt(b, l + 1);
    if (!r) r = AssignStmt(b, l + 1);
    if (!r) r = HavocStmt(b, l + 1);
    if (!r) r = CallStmt(b, l + 1);
    if (!r) r = IfStmt(b, l + 1);
    if (!r) r = WhileStmt(b, l + 1);
    if (!r) r = MatchStmt(b, l + 1);
    if (!r) r = ForeachStmt(b, l + 1);
    if (!r) r = OneStmt_11(b, l + 1);
    if (!r) r = OneStmt_12(b, l + 1);
    if (!r) r = OneStmt_13(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "label"
  //     Ident ":"
  private static boolean OneStmt_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "label");
    r = r && Ident(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // "break"
  //    ( Ident
  //     )?";"
  private static boolean OneStmt_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "break");
    r = r && OneStmt_12_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Ident
  //     )?
  private static boolean OneStmt_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_12_1")) return false;
    OneStmt_12_1_0(b, l + 1);
    return true;
  }

  // ( Ident
  //     )
  private static boolean OneStmt_12_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_12_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "return"
  //     ";"
  private static boolean OneStmt_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "return");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "||" | '\u2228'
  public static boolean OrOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_OP, "<or op>");
    r = consumeToken(b, "||");
    if (!r) r = consumeToken(b, "\\u2228");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "*"
  //   | Expression
  public static boolean PossiblyWildExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PossiblyWildExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSSIBLY_WILD_EXPRESSION, "<possibly wild expression>");
    r = consumeToken(b, "*");
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "*"
  //   | FrameExpression
  public static boolean PossiblyWildFrameExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PossiblyWildFrameExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSSIBLY_WILD_FRAME_EXPRESSION, "<possibly wild frame expression>");
    r = consumeToken(b, "*");
    if (!r) r = FrameExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "print"
  //   AttributeArg
  //  ( "," AttributeArg
  //   )*  ";"
  public static boolean PrintStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRINT_STMT, "<print stmt>");
    r = consumeToken(b, "print");
    r = r && AttributeArg(b, l + 1);
    r = r && PrintStmt_2(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "," AttributeArg
  //   )*
  private static boolean PrintStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PrintStmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PrintStmt_2", c)) break;
    }
    return true;
  }

  // "," AttributeArg
  private static boolean PrintStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && AttributeArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "::" | '\u2022'
  public static boolean QSep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QSep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, Q_SEP, "<q sep>");
    r = consumeToken(b, "::");
    if (!r) r = consumeToken(b, "\\u2022");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( Forall
  //   | Exists
  //   )
  //   IdentTypeOptional
  //  ( ","
  //     IdentTypeOptional
  //   )* ( AttributeOrTrigger )*  QSep
  //   Expression
  public static boolean QuantifierGuts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierGuts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUANTIFIER_GUTS, "<quantifier guts>");
    r = QuantifierGuts_0(b, l + 1);
    r = r && IdentTypeOptional(b, l + 1);
    r = r && QuantifierGuts_2(b, l + 1);
    r = r && QuantifierGuts_3(b, l + 1);
    r = r && QSep(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Forall
  //   | Exists
  private static boolean QuantifierGuts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierGuts_0")) return false;
    boolean r;
    r = Forall(b, l + 1);
    if (!r) r = Exists(b, l + 1);
    return r;
  }

  // ( ","
  //     IdentTypeOptional
  //   )*
  private static boolean QuantifierGuts_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierGuts_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QuantifierGuts_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QuantifierGuts_2", c)) break;
    }
    return true;
  }

  // ","
  //     IdentTypeOptional
  private static boolean QuantifierGuts_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierGuts_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && IdentTypeOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AttributeOrTrigger )*
  private static boolean QuantifierGuts_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierGuts_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QuantifierGuts_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QuantifierGuts_3", c)) break;
    }
    return true;
  }

  // ( AttributeOrTrigger )
  private static boolean QuantifierGuts_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierGuts_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AttributeOrTrigger(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "object"
  //   | "array"
  //     GenericInstantiation
  //   | Ident
  //    ( GenericInstantiation )?
  public static boolean ReferenceType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REFERENCE_TYPE, "<reference type>");
    r = consumeToken(b, "object");
    if (!r) r = ReferenceType_1(b, l + 1);
    if (!r) r = ReferenceType_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "array"
  //     GenericInstantiation
  private static boolean ReferenceType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "array");
    r = r && GenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Ident
  //    ( GenericInstantiation )?
  private static boolean ReferenceType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceType_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && ReferenceType_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GenericInstantiation )?
  private static boolean ReferenceType_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceType_2_1")) return false;
    ReferenceType_2_1_0(b, l + 1);
    return true;
  }

  // ( GenericInstantiation )
  private static boolean ReferenceType_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReferenceType_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "::=::="
  //   | "<"
  //   | ">"
  //   | "<::="
  //   | ">::="
  //   | "!::="
  //   | "!!"
  //   | "in"
  //   | "!in"
  //   | '\u2260'
  //   | '\u2264'
  //   | '\u2265'
  public static boolean RelOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REL_OP, "<rel op>");
    r = consumeToken(b, "::=::=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "<::=");
    if (!r) r = consumeToken(b, ">::=");
    if (!r) r = consumeToken(b, "!::=");
    if (!r) r = consumeToken(b, "!!");
    if (!r) r = consumeToken(b, "in");
    if (!r) r = consumeToken(b, "!in");
    if (!r) r = consumeToken(b, "\\u2260");
    if (!r) r = consumeToken(b, "\\u2264");
    if (!r) r = consumeToken(b, "\\u2265");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Term
  //  ( RelOp
  //     Term
  //   )?
  public static boolean RelationalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_EXPRESSION, "<relational expression>");
    r = Term(b, l + 1);
    r = r && RelationalExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( RelOp
  //     Term
  //   )?
  private static boolean RelationalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalExpression_1")) return false;
    RelationalExpression_1_0(b, l + 1);
    return true;
  }

  // RelOp
  //     Term
  private static boolean RelationalExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelOp(b, l + 1);
    r = r && Term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( IdentOrFuncExpression
  //   | ObjectExpression
  //   )
  //  ( SelectOrCallSuffix )*
  public static boolean SelectExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_EXPRESSION, "<select expression>");
    r = SelectExpression_0(b, l + 1);
    r = r && SelectExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IdentOrFuncExpression
  //   | ObjectExpression
  private static boolean SelectExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectExpression_0")) return false;
    boolean r;
    r = IdentOrFuncExpression(b, l + 1);
    if (!r) r = ObjectExpression(b, l + 1);
    return r;
  }

  // ( SelectOrCallSuffix )*
  private static boolean SelectExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SelectExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SelectExpression_1", c)) break;
    }
    return true;
  }

  // ( SelectOrCallSuffix )
  private static boolean SelectExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectOrCallSuffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ""
  //     Ident
  //    ( "("
  //        ( Expressions )?     ")"
  //     )?
  //   | "["
  //       ( Expression
  //        ( ""
  //          ( Expression
  //           )?       | ":::="
  //           Expression
  //         )?     | "" Expression
  //       )
  //     "]"
  public static boolean SelectOrCallSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_OR_CALL_SUFFIX, "<select or call suffix>");
    r = SelectOrCallSuffix_0(b, l + 1);
    if (!r) r = SelectOrCallSuffix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ""
  //     Ident
  //    ( "("
  //        ( Expressions )?     ")"
  //     )?
  private static boolean SelectOrCallSuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "");
    r = r && Ident(b, l + 1);
    r = r && SelectOrCallSuffix_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "("
  //        ( Expressions )?     ")"
  //     )?
  private static boolean SelectOrCallSuffix_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_0_2")) return false;
    SelectOrCallSuffix_0_2_0(b, l + 1);
    return true;
  }

  // "("
  //        ( Expressions )?     ")"
  private static boolean SelectOrCallSuffix_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && SelectOrCallSuffix_0_2_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Expressions )?
  private static boolean SelectOrCallSuffix_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_0_2_0_1")) return false;
    SelectOrCallSuffix_0_2_0_1_0(b, l + 1);
    return true;
  }

  // ( Expressions )
  private static boolean SelectOrCallSuffix_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "["
  //       ( Expression
  //        ( ""
  //          ( Expression
  //           )?       | ":::="
  //           Expression
  //         )?     | "" Expression
  //       )
  //     "]"
  private static boolean SelectOrCallSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && SelectOrCallSuffix_1_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression
  //        ( ""
  //          ( Expression
  //           )?       | ":::="
  //           Expression
  //         )?     | "" Expression
  private static boolean SelectOrCallSuffix_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectOrCallSuffix_1_1_0(b, l + 1);
    if (!r) r = SelectOrCallSuffix_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression
  //        ( ""
  //          ( Expression
  //           )?       | ":::="
  //           Expression
  //         )?
  private static boolean SelectOrCallSuffix_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && SelectOrCallSuffix_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ""
  //          ( Expression
  //           )?       | ":::="
  //           Expression
  //         )?
  private static boolean SelectOrCallSuffix_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1_0_1")) return false;
    SelectOrCallSuffix_1_1_0_1_0(b, l + 1);
    return true;
  }

  // ""
  //          ( Expression
  //           )?       | ":::="
  //           Expression
  private static boolean SelectOrCallSuffix_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelectOrCallSuffix_1_1_0_1_0_0(b, l + 1);
    if (!r) r = SelectOrCallSuffix_1_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ""
  //          ( Expression
  //           )?
  private static boolean SelectOrCallSuffix_1_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "");
    r = r && SelectOrCallSuffix_1_1_0_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Expression
  //           )?
  private static boolean SelectOrCallSuffix_1_1_0_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1_0_1_0_0_1")) return false;
    SelectOrCallSuffix_1_1_0_1_0_0_1_0(b, l + 1);
    return true;
  }

  // ( Expression
  //           )
  private static boolean SelectOrCallSuffix_1_1_0_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1_0_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ":::="
  //           Expression
  private static boolean SelectOrCallSuffix_1_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":::=");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "" Expression
  private static boolean SelectOrCallSuffix_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectOrCallSuffix_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( BlockStmt
  //   )*  ( OneStmt
  //   | VarDeclStmts
  //   )
  public static boolean Stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = Stmt_0(b, l + 1);
    r = r && Stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( BlockStmt
  //   )*
  private static boolean Stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Stmt_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Stmt_0", c)) break;
    }
    return true;
  }

  // ( BlockStmt
  //   )
  private static boolean Stmt_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OneStmt
  //   | VarDeclStmts
  private static boolean Stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt_1")) return false;
    boolean r;
    r = OneStmt(b, l + 1);
    if (!r) r = VarDeclStmts(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Factor
  //  ( AddOp
  //     Factor
  //   )*
  public static boolean Term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = Factor(b, l + 1);
    r = r && Term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( AddOp
  //     Factor
  //   )*
  private static boolean Term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Term_1", c)) break;
    }
    return true;
  }

  // AddOp
  //     Factor
  private static boolean Term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddOp(b, l + 1);
    r = r && Factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeAndToken
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = TypeAndToken(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "bool"
  //   | "int"
  //   | "set"
  //     GenericInstantiation
  //   | "seq"
  //     GenericInstantiation
  //   | ReferenceType
  public static boolean TypeAndToken(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_AND_TOKEN, "<type and token>");
    r = consumeToken(b, "bool");
    if (!r) r = consumeToken(b, "int");
    if (!r) r = TypeAndToken_2(b, l + 1);
    if (!r) r = TypeAndToken_3(b, l + 1);
    if (!r) r = ReferenceType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "set"
  //     GenericInstantiation
  private static boolean TypeAndToken_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "set");
    r = r && GenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "seq"
  //     GenericInstantiation
  private static boolean TypeAndToken_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "seq");
    r = r && GenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( "ghost"
  //   )? TypeAndToken
  //  ( ":"
  //     Type
  //   )?
  public static boolean TypeIdentOptional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_IDENT_OPTIONAL, "<type ident optional>");
    r = TypeIdentOptional_0(b, l + 1);
    r = r && TypeAndToken(b, l + 1);
    r = r && TypeIdentOptional_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "ghost"
  //   )?
  private static boolean TypeIdentOptional_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_0")) return false;
    TypeIdentOptional_0_0(b, l + 1);
    return true;
  }

  // ( "ghost"
  //   )
  private static boolean TypeIdentOptional_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ghost");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ":"
  //     Type
  //   )?
  private static boolean TypeIdentOptional_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_2")) return false;
    TypeIdentOptional_2_0(b, l + 1);
    return true;
  }

  // ":"
  //     Type
  private static boolean TypeIdentOptional_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "-"
  //     UnaryExpression
  //   | NegOp
  //     UnaryExpression
  //   | SelectExpression
  //   | ConstAtomExpression
  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    r = UnaryExpression_0(b, l + 1);
    if (!r) r = UnaryExpression_1(b, l + 1);
    if (!r) r = SelectExpression(b, l + 1);
    if (!r) r = ConstAtomExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "-"
  //     UnaryExpression
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "-");
    r = r && UnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NegOp
  //     UnaryExpression
  private static boolean UnaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NegOp(b, l + 1);
    r = r && UnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "use"
  //   Expression ";"
  public static boolean UseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE_STMT, "<use stmt>");
    r = consumeToken(b, "use");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( "ghost"
  //   )? "var"
  //   IdentTypeRhs
  //  ( "," IdentTypeRhs
  //   )*  ";"
  public static boolean VarDeclStmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_DECL_STMTS, "<var decl stmts>");
    r = VarDeclStmts_0(b, l + 1);
    r = r && consumeToken(b, "var");
    r = r && IdentTypeRhs(b, l + 1);
    r = r && VarDeclStmts_3(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "ghost"
  //   )?
  private static boolean VarDeclStmts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStmts_0")) return false;
    VarDeclStmts_0_0(b, l + 1);
    return true;
  }

  // ( "ghost"
  //   )
  private static boolean VarDeclStmts_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStmts_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ghost");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," IdentTypeRhs
  //   )*
  private static boolean VarDeclStmts_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStmts_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarDeclStmts_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarDeclStmts_3", c)) break;
    }
    return true;
  }

  // "," IdentTypeRhs
  private static boolean VarDeclStmts_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStmts_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && IdentTypeRhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "while"
  //   Guard
  //  (
  //     ( "free"
  //      )?    "invariant"
  //      Expression
  //      ";"
  //    | "decreases"
  //      PossiblyWildExpression
  //     ( "," PossiblyWildExpression
  //      )*     ";"
  //   )*  BlockStmt
  public static boolean WhileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STMT, "<while stmt>");
    r = consumeToken(b, "while");
    r = r && Guard(b, l + 1);
    r = r && WhileStmt_2(b, l + 1);
    r = r && BlockStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //     ( "free"
  //      )?    "invariant"
  //      Expression
  //      ";"
  //    | "decreases"
  //      PossiblyWildExpression
  //     ( "," PossiblyWildExpression
  //      )*     ";"
  //   )*
  private static boolean WhileStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhileStmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileStmt_2", c)) break;
    }
    return true;
  }

  // ( "free"
  //      )?    "invariant"
  //      Expression
  //      ";"
  //    | "decreases"
  //      PossiblyWildExpression
  //     ( "," PossiblyWildExpression
  //      )*     ";"
  private static boolean WhileStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhileStmt_2_0_0(b, l + 1);
    if (!r) r = WhileStmt_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "free"
  //      )?    "invariant"
  //      Expression
  //      ";"
  private static boolean WhileStmt_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhileStmt_2_0_0_0(b, l + 1);
    r = r && consumeToken(b, "invariant");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "free"
  //      )?
  private static boolean WhileStmt_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2_0_0_0")) return false;
    WhileStmt_2_0_0_0_0(b, l + 1);
    return true;
  }

  // ( "free"
  //      )
  private static boolean WhileStmt_2_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "free");
    exit_section_(b, m, null, r);
    return r;
  }

  // "decreases"
  //      PossiblyWildExpression
  //     ( "," PossiblyWildExpression
  //      )*     ";"
  private static boolean WhileStmt_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "decreases");
    r = r && PossiblyWildExpression(b, l + 1);
    r = r && WhileStmt_2_0_1_2(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( "," PossiblyWildExpression
  //      )*
  private static boolean WhileStmt_2_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2_0_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhileStmt_2_0_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileStmt_2_0_1_2", c)) break;
    }
    return true;
  }

  // "," PossiblyWildExpression
  private static boolean WhileStmt_2_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_2_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && PossiblyWildExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
