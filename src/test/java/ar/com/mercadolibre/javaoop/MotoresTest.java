package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotoresTest{

    @Test
    public void crearMotorACombustibleYQueExista(){
        MotorCombustible motorACombustible = new MotorCombustible();
        Assertions.assertThat(motorACombustible).isNotNull();
    }

    @Test
    public void cuandoCreasUnMotorCombustibleSeSeteanLosAtributos(){
        MotorCombustible motorCombustible = new MotorCombustible(100D, 1000);
        Assertions.assertThat(motorCombustible.getTemperatura()).isEqualTo(100);
        Assertions.assertThat(motorCombustible.getPotencia()).isEqualTo(1000);
    }

    @Test
    public void cuandoCreasUnMotorNuclearSeSeteanLosAtributos(){
        MotorNuclear motorNuclear = new MotorNuclear(100D, 1000);
        Assertions.assertThat(motorNuclear.getTemperatura()).isEqualTo(100);
        Assertions.assertThat(motorNuclear.getPotencia()).isEqualTo(1000);
    }

    @Test
    public void cuandoCreasUnMotorSolarSeSeteanLosAtributos(){
        MotorSolar motorSolar = new MotorSolar(100D, 1000);
        Assertions.assertThat(motorSolar.getTemperatura()).isEqualTo(100D);
        Assertions.assertThat(motorSolar.getPotencia()).isEqualTo(1000);
    }

    @Test
    public void subirPotenciaMotorYVerificarPotencia(){
        MotorCombustible motorCombustible = new MotorCombustible(100D, 1000);
        motorCombustible.modificarPotencia(50);

        Assertions.assertThat(motorCombustible.getPotencia()).isEqualTo(1050);
    }

    @Test
    public void subirPotenciaMotorYVerificarTemperatura(){
        MotorSolar motorSolar = new MotorSolar(100D, 1000);
        motorSolar.modificarPotencia(30);

        Assertions.assertThat(motorSolar.getTemperatura()).isEqualTo(130);
    }

    @Test
    public void bajarPotenciaMotorYVerificarPotencia(){
        MotorNuclear motorNuclear = new MotorNuclear(100D, 1000);
        motorNuclear.modificarPotencia(-30);

        Assertions.assertThat(motorNuclear.getPotencia()).isEqualTo(970);
    }

    @Test
    public void bajarPotenciaMotorHastaPotenciaNegativa(){
        MotorNuclear motorNuclear = new MotorNuclear(100D, 1000);
        motorNuclear.modificarPotencia(-3000);

        Assertions.assertThat(motorNuclear.getPotencia()).isEqualTo(0);
    }

    @Test
    public void refrigerarMotor(){
        MotorNuclear motorNuclear = new MotorNuclear(100D, 1000);
        motorNuclear.refrigerar();
        Assertions.assertThat(motorNuclear.getTemperatura()).isEqualTo(80);
    }
}
