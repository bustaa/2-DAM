import { Text, Pressable, View, TextInput, StyleSheet, Alert } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [text, setText] = useState('');

  function handleOnPress() {
    if (text.length === 0) {
      Alert.alert('Alert', 'No has introducido nada', [
        {
          text: 'OK'
        }
      ]);
    } else if (text >= 0) {
      Alert.alert('Alert', 'Has introducido un numero', [
        {
          text: 'OK'
        }
      ])
    } else {
      Alert.alert('Alert', 'Has introducido un texto', [
        {
          text: 'OK'
        }
      ])
    }
  }
  
  return (
    <View style={styles.container}>
      <TextInput
        style={{ height: 40 }}
        placeholder='Inserta tu texto...'
        onChangeText={(newText) => setText(newText)}
        defaultValue={text}
      />
      <Pressable 
        onPress={() => handleOnPress()}
        style={styles.btn}
      >
        <Text style={styles.btnText}>Pulsa...</Text>
      </Pressable>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center'
  },
  btn: {
    marginTop: 15,
    backgroundColor: 'blue',
    width: 100,
    height: 40,
    borderRadius: 5,
    color: 'green'
  },
  btnText: {
    color: 'white',
    margin:'auto'
  }
})