import { View, Pressable, Text, Image, StyleSheet } from 'react-native';
import { useState } from 'react';
let aumentar = true;

export default function App() {
  const [text, setText] = useState('My Title');
  const [backColor, setBackColor] = useState('white');
  const [sqrSize, setSqrSize] = useState(150);
  const [sqrColor, setSqrColor] = useState('green');

  function handleOnPress() {
    if (sqrColor === 'green') {
      setSqrColor('yellow');
      setBackColor('black');
    } else {
      setSqrColor('green');
      setBackColor('white');
    }   

    if (aumentar) {
      setSqrSize(sqrSize + 20);
      if (sqrSize > screen.width) {
        aumentar = false;
      }
    } else {
      setSqrSize(sqrSize - 20);
      if (sqrSize < 150) aumentar = true;
    }
  }

  return (
    <View style={[styles.container, {backgroundColor : backColor}]}>
      <Text style={styles.title}>{text}</Text>
      <View 
        style={{
          height: sqrSize, 
          width: sqrSize, 
          backgroundColor: sqrColor,
        }}
      ></View>
      <Pressable onPress={handleOnPress}>
        <Text style={styles.text }>
          Pulsame!
        </Text>
      </Pressable> 
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'yellow',
    alignItems: 'center',
    justifyContent:'center',
  },
  title: {
    fontSize: 25,
    fontWeight: 'bold',
    fontStyle: 'italic',
    textDecorationLine: 'underline',
  },
  image: {
    width: 200,
    height: 200,
  },
  text: {
    height: 40,
    width: 80,
    backgroundColor: 'blue',
    borderRadius: 8,
    padding: 6,
  },
});