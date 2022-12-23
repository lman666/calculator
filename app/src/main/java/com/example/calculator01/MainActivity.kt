package com.example.calculator01

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var str : String = "0"
    private var switch : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE){
            //如果横屏，设置横屏UI
            setContentView(R.layout.activity_main_land)
            initCal()
            bindExtraBtn()
        }else{
            //否则，设置竖屏UI
            setContentView(R.layout.activity_main_port)
            initCal()
        }
    }

//    横竖屏切换
    override fun onConfigurationChanged(newConfig : Configuration ) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            //如果横屏，设置横屏UI
            setContentView(R.layout.activity_main_land)
            initCal()
            bindExtraBtn()
        }else{
            //否则，设置竖屏UI
            setContentView(R.layout.activity_main_port)
            initCal()
        }
    }

//    按钮事件绑定
    fun initCal() {
//        显示栏
        val ed_input : EditText = findViewById(R.id.ed_input)

//        清除键
        val btn_clear : Button = findViewById(R.id.btn_clear)
        val btn_delete : Button = findViewById(R.id.btn_delete)

//        小数点
        val btn_dot : Button = findViewById(R.id.btn_dot)

//        数字
        val btn_0 : Button = findViewById(R.id.btn_0)
        val btn_1 : Button = findViewById(R.id.btn_1)
        val btn_2 : Button = findViewById(R.id.btn_2)
        val btn_3 : Button = findViewById(R.id.btn_3)
        val btn_4 : Button = findViewById(R.id.btn_4)
        val btn_5 : Button = findViewById(R.id.btn_5)
        val btn_6 : Button = findViewById(R.id.btn_6)
        val btn_7 : Button = findViewById(R.id.btn_7)
        val btn_8 : Button = findViewById(R.id.btn_8)
        val btn_9 : Button = findViewById(R.id.btn_9)

//        运算符
        val btn_divide : Button = findViewById(R.id.btn_divide)
        val btn_multiply : Button = findViewById(R.id.btn_multiply)
        val btn_add : Button = findViewById(R.id.btn_add)
        val btn_subtract : Button = findViewById(R.id.btn_subtract)

//        括号
        val btn_leftBracket : Button = findViewById(R.id.btn_leftBracket)
        val btn_rightBracket : Button = findViewById(R.id.btn_rightBracket)

//        等于号
        val btn_result : Button = findViewById(R.id.btn_result)

//        初始化显示栏
        ed_input.setText(str)

//        绑定事件
        btn_clear.setOnClickListener {       // 清除
            str = "0"
            ed_input.setText(str)
        }

        btn_delete.setOnClickListener {     // 删除
            if(str.length != 0) {
                str = str.substring(0, str.length - 1)
            }
            ed_input.setText(str)
        }

        btn_dot.setOnClickListener {       // 小数点
            if(str.last() in '0'..'9') {
                str += "."
            }
            else {
                str += "0."
            }
            ed_input.setText(str)
        }

        btn_divide.setOnClickListener {     // 商
            if(str == "0") {
                str = "÷"
            }
            else {
                str += "÷"
            }
            ed_input.setText(str)
        }

        btn_multiply.setOnClickListener {    // 乘
            if(str == "0") {
                str = "×"
            }
            else {
                str += "×"
            }
            ed_input.setText(str)
        }

        btn_add.setOnClickListener {      // 加
            if(str == "0") {
                str = "+"
            }
            else {
                str += "+"
            }
            ed_input.setText(str)
        }

        btn_subtract.setOnClickListener {      // 减
            if(str == "0") {
                str = "-"
            }
            else {
                str += "-"
            }
            ed_input.setText(str)
        }

        btn_leftBracket.setOnClickListener {     // 左括号
            if(str == "0") {
                str = "("
            }
            else {
                str += "("
            }
            ed_input.setText(str)
        }

        btn_rightBracket.setOnClickListener {     // 右括号
            if(str == "0") {
                str = ")"
            }
            else {
                str += ")"
            }
            ed_input.setText(str)
        }

//        数字
        btn_0.setOnClickListener {
            if(str == "0") {
                str = "0"
            }
            else {
                str += "0"
            }
            ed_input.setText(str)
        }
        btn_1.setOnClickListener {
            if(str == "0") {
                str = "1"
            }
            else {
                str += "1"
            }
            ed_input.setText(str)
        }
        btn_2.setOnClickListener {
            if(str == "0") {
                str = "2"
            }
            else {
                str += "2"
            }
            ed_input.setText(str)
        }
        btn_3.setOnClickListener {
            if(str == "0") {
                str = "3"
            }
            else {
                str += "3"
            }
            ed_input.setText(str)
        }
        btn_4.setOnClickListener {
            if(str == "0") {
                str = "4"
            }
            else {
                str += "4"
            }
            ed_input.setText(str)
        }
        btn_5.setOnClickListener {
            if(str == "0") {
                str = "5"
            }
            else {
                str += "5"
            }
            ed_input.setText(str)
        }
        btn_6.setOnClickListener {
            if(str == "0") {
                str = "6"
            }
            else {
                str += "6"
            }
            ed_input.setText(str)
        }
        btn_7.setOnClickListener {
            if(str == "0") {
                str = "7"
            }
            else {
                str += "7"
            }
            ed_input.setText(str)
        }
        btn_8.setOnClickListener {
            if(str == "0") {
                str = "8"
            }
            else {
                str += "8"
            }
            ed_input.setText(str)
        }
        btn_9.setOnClickListener {
            if(str == "0") {
                str = "9"
            }
            else {
                str += "9"
            }
            ed_input.setText(str)
        }
//        求值
        btn_result.setOnClickListener {
            str = calculator(str)
            ed_input.setText(str)
        }
    }

//        横屏时额外按钮的绑定
    fun bindExtraBtn() {
        val btn_surplus : Button = findViewById(R.id.btn_surplus)
        val btn_pow : Button = findViewById(R.id.btn_pow)
        val ed_input : EditText = findViewById(R.id.ed_input)

        btn_surplus.setOnClickListener {    // 取余
            if(str == "0") {
                str = "%"
            }
            else {
                str += "%"
            }
            ed_input.setText(str)
        }

        btn_pow.setOnClickListener {     // 幂次方
            if(str == "0") {
                str = "^"
            }
            else {
                str += "^"
            }
            ed_input.setText(str)
        }
    }

//    计算一次结果
    fun calculator (s : String) : String {
        var str = s
        var i : Int = 0
        var numStr : String = ""
        var tempNum = 0.0
        var numS = ArrayList<Double>()    // 操作数栈
        var opS = ArrayList<Char>()      // 运算符栈
        var opPriority = HashMap<Char, Int>()    // 记录各运算符的优先级

        for(j in 0 until 8) {
            opPriority.put('(', 0)
            opPriority.put('+', 1)
            opPriority.put('-', 1)
            opPriority.put('×', 2)
            opPriority.put('÷', 2)
            opPriority.put('%', 2)
            opPriority.put('^', 3)
            opPriority.put(')', 4)
        }

//        解析字符串算术式
        try {
            while (i < s.length) {
                // 数字部分组成字符串
                if (str[i] in '0'..'9' || str[i] == '.') {
                    numStr += str[i]
                }
                else {    //非数字部分处理
                    // 将字符串转化成数字入栈
                    if (numStr.length > 0) {
                        tempNum = numStr.toDouble()
                        numS.add(tempNum)
                        numStr = ""
                    }
                    if (opS.isEmpty()) {
                        opS.add(str[i])
                    }  //  将首个运算符入栈
                    else {
                        if (str[i] == '(') {
                            opS.add(str[i])
                        }
                        else if (str[i] == ')') {
                            //  遇到右括号优先计算
                            while(opS.last() != '(') {
                                operation(opS, numS)
                            }
                            opS.removeAt(opS.size - 1)     // 移出左括号
                        }
                        else {
                            do {
                                // 运算符优先级比较
                                // 若优先级比栈中运算符低，则出栈进行运算
                                if (judgePriority(str[i], opS.last(), opPriority)) {
                                    operation(opS, numS)
                                    if (opS.isEmpty()) {
                                        opS.add(str[i])
                                        break
                                    }
                                }
                                // 否则压栈
                                else {
                                    opS.add(str[i])
                                    break
                                }
                            }while(!opS.isEmpty())
                        }
                    }
                }
                i++
            }
            if (numStr.length > 0) {
                //  字符串里面有数字
                tempNum = numStr.toDouble()
                numS.add(tempNum)
            }
            while (!opS.isEmpty()) {
                operation(opS, numS)
            }
            if(numS.size > 1) {
                throw Throwable()
            }
        } catch (e: MyException) {
            return "分母不能为0"
        } catch (e: Throwable) {
            return "表达式错误"
        }

//        返回结果
        return clearZero(numS.removeAt(numS.size - 1).toString())
    }

//    比较运算符的优先级
    fun judgePriority (op1 : Char, op2 : Char, opPriority : HashMap<Char, Int>) : Boolean{
        return opPriority.getValue(op1) <= opPriority.getValue(op2)
    }

//    去掉小数点后多余的0
    fun clearZero (s : String) : String {
        var str = s
        var flag : Boolean = true
        var zeroNum : Int = 0
        for (i in str.length - 1 downTo 0) {
            if (str[i] == '.') {
                str = str.substring(0, str.length - zeroNum)
                break
            }
            if (str[i] >= '1' && str[i] <= '9') {
                flag = false
            }
            if (str[i] == '0' && flag) {
                zeroNum++
            }
        }
        if (str.last() == '.') {
            str = str.substring(0, str.length - 1)
        }
        return str
    }


//    进行一次二元运算
    fun operation (opS : ArrayList<Char>, numS : ArrayList<Double>) {
        var n1 : Double
        var n2 : Double
        var n3 : Double
        var op : Char
        op = opS.last()
        opS.removeAt(opS.size - 1)
        n2 = numS.last()
        numS.removeAt(numS.size - 1)
        n1 = numS.last()
        numS.removeAt(numS.size - 1)
        n3 = operationOnce(n1, op, n2)
        numS.add(n3)
    }

//    运算
    fun operationOnce (n1 : Double, op : Char, n2 : Double) : Double{
        var result : Double = 0.0
        when(op) {
            '+' -> result = n1 + n2
            '-' -> result = n1 - n2
            '×' -> result = n1 * n2
            '%' -> result = n1 % n2
            '^' -> result = Math.pow(n1, n2)
            '÷' -> {
                if(n2 > -0.000001 && n2 < 0.000001) {   // 判断分母是否为0
                    throw MyException()
                }
                result = n1 / n2
            }
            '(' -> throw Throwable()
            ')' -> throw Throwable()
        }
        return result
    }
}

//  若分母为0，抛出异常
class MyException() : Throwable(){

}
