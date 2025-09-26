import { Text, Pressable, TextInput, View, StyleSheet, Alert } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [dni, setDni] = useState('');

  function handleOnPress() {
    if (dni.length < 9) {
      Alert.alert('Alert', 'El DNI debe tener una longitud de 9 caracteres', [
        {
          text: 'OK'
        }
      ])
    } else {
      for (i = 0; i < 8; i++) {
        if (!dni[i] >= 0) {
          Alert.alert('Alert', 'El DNI debe tener 8 numeros', [
            {
              text: 'OK'
            }
          ])
          return 0;
        }
      }
      if (dni[8] >= 0) {
        Alert.alert('Alert', 'El DNI debe contener una letra', [
          {
            text: 'OK'
          }
        ])
        return 0;
      }
      Alert.alert('Alert', 'El DNI es correcto', [
        {
          text: 'OK'
        }
      ])
    }
  }

  return (
    <View style={styles.container}>
      <Text style={styles.textTitle}>Validador DNI</Text>
      <TextInput
        style={{ height: 40 }}
        placeholder='Inserta DNI'
        onChangeText={(newText) => setDni(newText)}
        defaultValue={dni}
      />
      <Pressable style={styles.btn} onPress={() => handleOnPress()}>
        <Text style={styles.btnContent}>Pulsa...</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center'
  },
  textTitle: {
    fontSize: 25,
    fontWeight: 500,
    marginBotto: 15
  },
  btn: {
    marginTop: 15,
    backgroundColor: 'blue',
    width: 100,
    height: 40,
    borderRadius: 5
  },
  btnContent: {
    margin: 'auto',
    color: 'white'
  }
})

