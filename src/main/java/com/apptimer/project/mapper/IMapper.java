package com.apptimer.project.mapper;


/**
 *
 *  Timer APP
 *  Agendapp
 *
 *  Gestión de tareas personal // Personal Task management
 *
 * @version 1.0.0 2023-06-16
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

//Recibe un Dato de entrada IN  y otro de SALIDA OUT
public interface IMapper <Int, Out> {

       public Out map(Int in);

}
