package e_观察者模式.s1;

/**
 * @author wushang
 * @description:
 * @date 2020-08-17
 */
//具体目标：人民币汇率
class RMBrate extends Rate {

    @Override
    public void change(int number) {
        for (Company obs : companys) {
            ((Company) obs).response(number);
        }
    }
}
